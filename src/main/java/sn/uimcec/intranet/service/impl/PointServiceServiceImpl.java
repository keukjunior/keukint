package sn.uimcec.intranet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import sn.uimcec.intranet.dto.PointServiceDto;
import sn.uimcec.intranet.repository.PointServiceRepository;
import sn.uimcec.intranet.service.PointService;

import java.util.List;

public class PointServiceServiceImpl implements PointService {
    private PointServiceRepository pointServiceRepository;
   @Autowired
   public PointServiceServiceImpl(PointServiceRepository pointServiceRepository){
   this.pointServiceRepository=pointServiceRepository;

   }
    @Override
    public PointServiceDto save(PointServiceDto dto) {
        return null;
    }

    @Override
    public PointServiceDto findById(Integer id) {
        return null;
    }

    @Override
    public PointServiceDto findByCode(String code) {
        return null;
    }

    @Override
    public List<PointServiceDto> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
