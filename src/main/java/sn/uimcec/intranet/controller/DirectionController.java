package sn.uimcec.intranet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import sn.uimcec.intranet.controller.api.DirectionApi;
import sn.uimcec.intranet.dto.DirectionDto;

import java.util.List;

public class DirectionController implements DirectionApi {
    @Autowired
    private DirectionController directionController;

    public DirectionController(DirectionController directionController){
        this.directionController=directionController;
    }

    @Override
    public DirectionDto save(DirectionDto dto) {
        return null;
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
