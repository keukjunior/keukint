package sn.uimcec.intranet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import sn.uimcec.intranet.controller.api.DirectionApi;
import sn.uimcec.intranet.dto.DirectionDto;
import sn.uimcec.intranet.service.DirectionService;

import java.util.List;
@RestController
public class DirectionController implements DirectionApi {
    @Autowired
    private DirectionService directionService;

    public DirectionController(DirectionService directionService){
        this.directionService=directionService;
    }

    @Override
    public DirectionDto save(DirectionDto dto) {
        return directionService.save(dto);
        //return null;
    }

    @Override
    public DirectionDto findById(Integer id) {
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
