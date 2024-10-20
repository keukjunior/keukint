package sn.uimcec.intranet.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import sn.uimcec.intranet.model.*;
import sn.uimcec.intranet.security.entities.AppRole;
import sn.uimcec.intranet.security.entities.AppUser;

import java.util.List;

/*@Builder
@Data
@AllArgsConstructor*/
public class UserDto {


   /* private String id;
    private String nom;
    private String prenom;
    private String username;
    private String password;
    private String email;
    //private String fonction;

    //private boolean enable;
   // private EntiteDto entiteDto;
    //private DirectionDto directionDto;
    //private AgenceDto agenceDto;
    //private PointServiceDto pointServiceDto;

    private List<AppRoleDto> rolesdto;


    public static UserDto fromUser(AppUser ser){
        if(ser == null)
            return null;
        return UserDto.builder()
                .id(ser.getUserId())
                .nom(ser.getNom())
                .prenom(ser.getPrenom())
                .username(ser.getUsername())
                .password(ser.getPassword())
                //.rolesdto(ser)
                //.fonction(ser.getFonction())
                //.enable(ser.isEnable())
                //.entiteDto(EntiteDto.fromEntite(ser.getEntite()))
                //.directionDto(DirectionDto.fromDirection(ser.getDirection()))
                //.agenceDto(AgenceDto.fromAgence(ser.getAgence()))
               // .pointServiceDto(PointServiceDto.fromPointService(ser.getPointService()))
                .build();

    }

    public static AppUser toUser(UserDto dto){
        if(dto == null)
            return null;
        AppUser dire = new AppUser();
        dire.setUserId(dto.getId());

        dire.setNom(dto.getNom());
        dire.setPrenom(dto.getPrenom());
        dire.setUsername(dto.getUsername());
        dire.setPassword(dto.getPassword());
       // dire.setFonction(dto.getFonction());
        //dire.setEnable(dto.isEnable());

       // dire.setEntite(EntiteDto.toEntite(dto.getEntiteDto()));
       // dire.setDirection(DirectionDto.toDirection(dto.getDirectionDto()));
       // dire.setAgence(AgenceDto.toAgence(dto.getAgenceDto()));
        //dire.setPointService(PointServiceDto.toPointService(dto.getPointServiceDto()));
        return dire;
    }*/
}
