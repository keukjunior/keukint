package sn.uimcec.intranet.service;

import sn.uimcec.intranet.dto.AnnonceDto;

import java.util.List;

public interface AnnonceService {

    AnnonceDto save(AnnonceDto dto);

    AnnonceDto findById(Integer id);

    AnnonceDto findByCode(String code);

    List<AnnonceDto> findAll();

    void delete(Integer id);
}
