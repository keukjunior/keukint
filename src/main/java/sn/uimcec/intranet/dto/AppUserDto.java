package sn.uimcec.intranet.dto;

import lombok.Builder;
import lombok.Data;
import sn.uimcec.intranet.security.entities.AppUser;
import sn.uimcec.intranet.model.PointService;

import java.util.List;
@Builder
@Data
public class AppUserDto {

    private String id;
    private String nom;
    private String prenom;
    private String username;
    private String password;
    private String email;
    private FonctionDto fonctionDto;

    private boolean enable;
    private EntiteDto entiteDto;
    private DirectionDto directionDto;
    private AgenceDto agenceDto;
    private PointServiceDto pointServiceDto;

    private List<AppRoleDto> rolesdto;


    public static AppUserDto fromUser(AppUser ser){
        if(ser == null)
            return null;
        return AppUserDto.builder()
                .id(ser.getUserId())
                .nom(ser.getNom())
                .prenom(ser.getPrenom())
                .username(ser.getUsername())
                .password(ser.getPassword())
                //.rolesdto(ser)
                //.fonction(ser.getFonction())
                .fonctionDto(FonctionDto.fromFonction(ser.getFonction()))
                .entiteDto(EntiteDto.fromEntite(ser.getEntite()))
                .directionDto(DirectionDto.fromDirection(ser.getDirection()))
                .agenceDto(AgenceDto.fromAgence(ser.getAgence()))
                //.pointServiceDto(PointServiceDto.fromPointService(ser.getPointService()))
                .build();

    }

    public static AppUser toUser(AppUserDto dto){
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
    }
}
