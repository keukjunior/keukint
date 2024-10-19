package sn.uimcec.intranet.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.uimcec.intranet.dto.DirectionDto;
import sn.uimcec.intranet.repository.DirectionRepository;
import sn.uimcec.intranet.service.DirectionService;
import sn.uimcec.intranet.validator.DirectionValidator;

import java.util.List;
@Service
@Slf4j
public class DirectionServiceImpl implements DirectionService {
    private DirectionRepository directionRepository;
    @Autowired
    public DirectionServiceImpl(DirectionRepository directionRepository){
        this.directionRepository=directionRepository;
    }


    @Override
    public DirectionDto save(DirectionDto dto) {
        List<String> errors = DirectionValidator.validate(dto);
        if(!errors.isEmpty()){
            log.error("Direction n'est pas valided",dto);
            //throw new InvalidEntityException("L'annonce n'est pas valide", ErrorCodes.ANNONCE_NOT_VALID,errors);
        }
        return DirectionDto.fromDirection(
                directionRepository.save(
                        DirectionDto.toDirection(dto)
                )
        );
    }

    @Override
    public DirectionDto findById(Integer id) {
        return null;
    }

    @Override
    public DirectionDto findByCode(String code) {
        return null;
    }

    @Override
    public List<DirectionDto> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
