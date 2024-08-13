package sn.uimcec.intranet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import sn.uimcec.intranet.controller.api.CategorieApi;
import sn.uimcec.intranet.dto.AnnonceDto;
import sn.uimcec.intranet.dto.CategorieDto;
import sn.uimcec.intranet.service.CategorieService;

import java.util.List;

@RestController
public class CategorieController implements CategorieApi {

    private CategorieService categorieService;
    @Autowired
    public CategorieController(CategorieService categorieService){
        this.categorieService=categorieService;
    }
    @Override
    public CategorieDto save(CategorieDto dto) {
        return categorieService.save(dto);
    }

    @Override
    public CategorieDto findById(Integer id) {
        return categorieService.findById(id);
    }

    @Override
    public List<CategorieDto> findAll() {
        return categorieService.findAll();
    }



    @Override
    public void delete(Integer id) {
     categorieService.delete(id);
    }
}
