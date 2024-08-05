package sn.uimcec.intranet.dto;

import lombok.Builder;
import lombok.Data;
import sn.uimcec.intranet.model.Direction;

@Builder
@Data
public class DirectionDto {
    private Integer id;
    private String nom;



    private EntiteDto entite;

    public static DirectionDto fromDirection(Direction cat){
        if(cat == null)
            return null;
        return DirectionDto.builder()
                .id(cat.getId())
                .nom(cat.getNom())
                .entite(EntiteDto.fromEntite(cat.getEntite()))
                .build();

    }

    public static Direction toDirection(DirectionDto dto){
        if(dto == null)
            return null;
        Direction dire = new Direction();
        dire.setId(dto.getId());
        dire.setNom(dto.getNom());
        dire.setEntite(EntiteDto.toEntite(dto.getEntite()));
        return dire;
    }
}
