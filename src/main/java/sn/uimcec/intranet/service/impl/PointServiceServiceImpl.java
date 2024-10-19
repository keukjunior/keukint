package sn.uimcec.intranet.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.uimcec.intranet.dto.EntiteDto;
import sn.uimcec.intranet.dto.PointServiceDto;
import sn.uimcec.intranet.repository.PointServiceRepository;

import sn.uimcec.intranet.service.PointServiceApi;
import sn.uimcec.intranet.validator.EntiteValidator;
import sn.uimcec.intranet.validator.PointServiceValidator;

import java.util.List;
@Service
@Slf4j
public class PointServiceServiceImpl implements PointServiceApi {
    private PointServiceRepository pointServiceRepository;
   @Autowired
   public PointServiceServiceImpl(PointServiceRepository pointServiceRepository){
   this.pointServiceRepository=pointServiceRepository;

   }
    @Override
    public PointServiceDto save(PointServiceDto dto) {

        List<String> errors = PointServiceValidator.validate(dto);
        if(!errors.isEmpty()){
            log.error("Annonce n'est pas valided",dto);
            //throw new InvalidEntityException("L'annonce n'est pas valide", ErrorCodes.ANNONCE_NOT_VALID,errors);
        }

        return  PointServiceDto.fromPointService(
                pointServiceRepository.save(
                        PointServiceDto.toPointService(dto)
                )
        );
    }

    @Override
    public PointServiceDto findById(Integer id) {
        return null;
    }

    @Override
    public PointServiceDto findByCode(String code) {
        return null;
    }

    @Override
    public List<PointServiceDto> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
