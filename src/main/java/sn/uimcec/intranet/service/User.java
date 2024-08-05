package sn.uimcec.intranet.service;


import sn.uimcec.intranet.dto.UserDto;

import java.util.List;

public interface User {

    UserDto save(UserDto dto);

    UserDto findById(Integer id);

    UserDto findByCode(String code);

    List<UserDto> findAll();

    void delete(Integer id);
}
