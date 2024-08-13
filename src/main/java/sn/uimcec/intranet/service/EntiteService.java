package sn.uimcec.intranet.service;

import sn.uimcec.intranet.dto.EntiteDto;

import java.util.List;

public interface EntiteService {


    EntiteDto save(EntiteDto dto);

    EntiteDto findById(Integer id);

    EntiteDto findByCode(String code);

    List<EntiteDto> findAll();

    void delete(Integer id);
}
