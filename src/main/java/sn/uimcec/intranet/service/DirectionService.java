package sn.uimcec.intranet.service;

import sn.uimcec.intranet.dto.AnnonceDto;

import java.util.List;

public interface DirectionService {

    DirectionDto save(DirectionDto dto);

    DirectionDto findById(Integer id);

    DirectionDto findByCode(String code);

    List<DirectionDto> findAll();

    void delete(Integer id);
}
