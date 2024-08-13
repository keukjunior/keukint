package sn.uimcec.intranet.controller;

import sn.uimcec.intranet.controller.api.EntiteApi;
import sn.uimcec.intranet.dto.;
import sn.uimcec.intranet.service.EntiteService;

import java.util.List;

public class EntiteController implements EntiteApi {

    private EntiteService entiteService;

    public EntiteController(EntiteService entiteService){
       this.entiteService=entiteService;
    }
    @Override
    public EntiteDto save(EntiteDto dto) {
        return entiteService.save(dto);

    }

    @Override
    public EntiteDto findById(Integer id) {
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
