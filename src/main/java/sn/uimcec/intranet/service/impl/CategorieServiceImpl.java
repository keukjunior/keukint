package sn.uimcec.intranet.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sn.uimcec.intranet.dto.AnnonceDto;
import sn.uimcec.intranet.dto.CategorieDto;
import sn.uimcec.intranet.repository.CategorieRepository;
import sn.uimcec.intranet.service.CategorieService;
import sn.uimcec.intranet.validator.AnnonceValidator;
import sn.uimcec.intranet.validator.CategorieValidator;

import java.util.List;
@Service
@Slf4j
public class CategorieServiceImpl implements CategorieService {

    private CategorieRepository categorieRepository;

    public CategorieServiceImpl(CategorieRepository categorieRepository){
      this.categorieRepository=categorieRepository;
    }
    @Override
    public CategorieDto save(CategorieDto dto) {
        List<String> errors = CategorieValidator.validate(dto);
        if(!errors.isEmpty()){
            log.error("Categorie n'est pas valided",dto);
            //throw new InvalidEntityException("L'annonce n'est pas valide", ErrorCodes.ANNONCE_NOT_VALID,errors);
        }
        return CategorieDto.fromCategorie(
                categorieRepository.save(
                        CategorieDto.toCategorie(dto)
                )
        );
    }

    @Override
    public CategorieDto findById(Integer id) {
        return null;
    }

    @Override
    public CategorieDto findByCode(String code) {
        return null;
    }

    @Override
    public List<CategorieDto> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
