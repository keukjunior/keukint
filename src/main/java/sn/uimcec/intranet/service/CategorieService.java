package sn.uimcec.intranet.service;

import sn.uimcec.intranet.dto.AnnonceDto;
import sn.uimcec.intranet.dto.CategorieDto;

import java.util.List;

public interface CategorieService {


    CategorieDto save(CategorieDto dto);

    CategorieDto findById(Integer id);

    CategorieDto findByCode(String code);

    List<CategorieDto> findAll();

    void delete(Integer id);
}
