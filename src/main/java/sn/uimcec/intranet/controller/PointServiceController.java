package sn.uimcec.intranet.controller;

import org.springframework.web.bind.annotation.RestController;
import sn.uimcec.intranet.controller.api.PointServiceApi;
import sn.uimcec.intranet.dto.EntiteDto;
import sn.uimcec.intranet.dto.PointServiceDto;
import sn.uimcec.intranet.service.PointService;

import java.util.List;
@RestController


public class PointServiceController implements PointServiceApi {
    private PointService pointService ;

    public PointServiceController(PointService pointService){
        this.pointService=pointService;
    }
    @Override
    public PointServiceDto save(PointServiceDto dto) {
        return pointService.save(dto);
    }

    @Override
    public EntiteDto findById(Integer id) {
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
