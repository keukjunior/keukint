package sn.uimcec.intranet.dto;

import lombok.Builder;
import lombok.Data;
import sn.uimcec.intranet.model.PointService;

@Builder
@Data
public class PointServiceDto {
    private Integer id;
    private String nom;


    private AgenceDto agence;


    private EntiteDto entite;


    public static PointServiceDto fromPointService(PointService ser){
        if(ser == null)
            return null;
        return PointServiceDto.builder()
                .id(ser.getId())
                .nom(ser.getNom())
                .agence(AgenceDto.fromAgence(ser.getAgence()))
                .entite(EntiteDto.fromEntite(ser.getEntite()))
                .build();

    }

    public static PointService toPointService(PointServiceDto dto){
        if(dto == null)
            return null;
        PointService dire = new PointService();
        dire.setId(dto.getId());
        dire.setNom(dto.getNom());
        dire.setAgence(AgenceDto.toAgence(dto.getAgence()));
        dire.setEntite(EntiteDto.toEntite(dto.getEntite()));
        return dire;
    }

    /*public static PointServiceDto fromPointService(sn.uimcec.intranet.service.PointService pointService) {
    }*/
}
