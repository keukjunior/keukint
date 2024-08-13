package sn.uimcec.intranet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import sn.uimcec.intranet.controller.api.AnnonceApi;
import sn.uimcec.intranet.dto.AnnonceDto;
import sn.uimcec.intranet.service.AnnonceService;

import java.util.List;
@RestController
public class AnnonceControlleur  implements AnnonceApi {

    private AnnonceService annonceService;
    @Autowired
    public AnnonceControlleur(AnnonceService annonceService){
    this.annonceService=annonceService;
    }
    @Override
    public AnnonceDto save(AnnonceDto dto) {
        return annonceService.save(dto);
    }

    @Override
    public AnnonceDto findById(Integer id) {
        return annonceService.findById(id);
    }

    @Override
    public List<AnnonceDto> findAll() {
        return annonceService.findAll();
    }

    @Override
    public List<AnnonceDto> findAllAnnonceByIdCategory(Integer id) {
        return annonceService.findAllArticleByIdCategory(id);
    }


    @Override
    public void delete(Integer id) {
      annonceService.delete(id);
    }
}
