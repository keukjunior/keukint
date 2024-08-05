package sn.uimcec.intranet.service;

import sn.uimcec.intranet.dto.AgenceDto;
import sn.uimcec.intranet.dto.AnnonceDto;

import java.util.List;

public interface AgenceService {
    AgenceDto save(AnnonceDto dto);

    AgenceDto findById(Integer id);

    AgenceDto findByCode(String code);

    List<AgenceDto> findAll();

    void delete(Integer id);
}
