package sn.uimcec.intranet.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sn.uimcec.intranet.dto.EntiteDto;
import sn.uimcec.intranet.repository.EntiteRepository;
import sn.uimcec.intranet.service.EntiteService;
import sn.uimcec.intranet.validator.EntiteValidator;

import java.util.List;
@Service
@Slf4j
public class EntiteServiceImpl  implements EntiteService {

    private EntiteRepository entiteRepository;

    public EntiteServiceImpl(EntiteRepository entiteRepository){
        this.entiteRepository=entiteRepository;

    }
    @Override
    public EntiteDto save(EntiteDto dto) {
        List<String> errors = EntiteValidator.validate(dto);
        if(!errors.isEmpty()){
            log.error("Annonce n'est pas valided",dto);
            //throw new InvalidEntityException("L'annonce n'est pas valide", ErrorCodes.ANNONCE_NOT_VALID,errors);
        }

        return  EntiteDto.fromEntite(
                entiteRepository.save(
                        EntiteDto.toEntite(dto)
                )
        );
    }

    @Override
    public EntiteDto findById(Integer id) {
        return null;
    }

    @Override
    public EntiteDto findByCode(String code) {
        return null;
    }

    @Override
    public List<EntiteDto> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
