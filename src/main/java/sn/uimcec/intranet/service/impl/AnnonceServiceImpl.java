package sn.uimcec.intranet.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.uimcec.intranet.dto.AnnonceDto;
import sn.uimcec.intranet.repository.AnnonceRepository;
import sn.uimcec.intranet.service.AnnonceService;
import sn.uimcec.intranet.validator.AnnonceValidator;

import java.util.List;
import java.util.stream.Collectors;

//import static org.hibernate.id.enhanced.HiLoOptimizer.log;
@Service
@Slf4j
public class AnnonceServiceImpl  implements AnnonceService {

  private AnnonceRepository annonceRepository;
    @Autowired
    public AnnonceServiceImpl(AnnonceRepository annonceRepository){
     this.annonceRepository=annonceRepository;
    }
    @Override
    public AnnonceDto save(AnnonceDto dto) {

        List<String> errors = AnnonceValidator.validate(dto);
        if(!errors.isEmpty()){
            log.error("Annonce n'est pas valided",dto);
            //throw new InvalidEntityException("L'annonce n'est pas valide", ErrorCodes.ANNONCE_NOT_VALID,errors);
        }
        return AnnonceDto.fromAnnonce(
                annonceRepository.save(
                        AnnonceDto.toAnnonce(dto)
                )
        );



    }

    @Override
    public AnnonceDto findById(Integer id) {

        return AnnonceDto.fromAnnonce(annonceRepository.findById(id).get());
    }

    @Override
    public List<AnnonceDto> findAllArticleByIdCategory(Integer idCategory) {
        return null;
    }



    @Override
    public List<AnnonceDto> findAll() {

        return annonceRepository.findAll()
                .stream()
                .map(AnnonceDto::fromAnnonce)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {

    }
}
