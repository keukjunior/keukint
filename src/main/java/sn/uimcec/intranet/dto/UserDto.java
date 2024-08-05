package sn.uimcec.intranet.dto;

import lombok.Builder;
import lombok.Data;

import sn.uimcec.intranet.model.User;

@Builder
@Data
public class UserDto {

    private Integer id;
    private String nom;
    private String prenom;
    private String login;
    private String password;

    private String fonction;

    private boolean enable;
    private EntiteDto entiteDto;
    private DirectionDto directionDto;
    private AgenceDto agenceDto;
    private PointServiceDto pointServiceDto;


    public static UserDto fromUser(User ser){
        if(ser == null)
            return null;
        return UserDto.builder()
                .id(ser.getId())
                .nom(ser.getNom())
                .prenom(ser.getPrenom())
                .login(ser.getLogin())
                .password(ser.getPassword())
                .fonction(ser.getFonction())
                .enable(ser.isEnable())
                .entiteDto(EntiteDto.fromEntite(ser.getEntite()))
                .directionDto(DirectionDto.fromDirection(ser.getDirection()))
                .agenceDto(AgenceDto.fromAgence(ser.getAgence()))
                .pointServiceDto(PointServiceDto.fromPointService(ser.getPointService()))
                .build();

    }

    public static User toUser(UserDto dto){
        if(dto == null)
            return null;
        User dire = new User();
        dire.setId(dto.getId());
        dire.setNom(dto.getNom());
        dire.setPassword(dto.getPassword());
        dire.setFonction(dto.getFonction());
        dire.setEnable(dto.isEnable());

        dire.setEntite(EntiteDto.toEntite(dto.getEntiteDto()));
        dire.setDirection(DirectionDto.toDirection(dto.getDirectionDto()));
        dire.setAgence(AgenceDto.toAgence(dto.getAgenceDto()));
        dire.setPointService(PointServiceDto.toPointService(dto.getPointServiceDto()));
        return dire;
    }
}
