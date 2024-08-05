package sn.uimcec.intranet.service;


import sn.uimcec.intranet.dto.PointServiceDto;

import java.util.List;

public interface PointService {
    PointServiceDto save(PointServiceDto dto);

    PointServiceDto findById(Integer id);

    PointServiceDto findByCode(String code);

    List<PointServiceDto> findAll();

    void delete(Integer id);
}
