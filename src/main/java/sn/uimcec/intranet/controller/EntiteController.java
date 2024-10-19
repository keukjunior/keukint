package sn.uimcec.intranet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import sn.uimcec.intranet.controller.api.EntiteApi;
import sn.uimcec.intranet.dto.EntiteDto;
import sn.uimcec.intranet.service.EntiteService;

import java.util.List;
@RestController
public class EntiteController implements EntiteApi {
    @Autowired
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
        return entiteService.findById(id);
    }

    @Override
    public List<EntiteDto> findAll() {
        return entiteService.findAll();
    }

    @Override
    public void delete(Integer id) {
      entiteService.delete(id
      );
    }
}
