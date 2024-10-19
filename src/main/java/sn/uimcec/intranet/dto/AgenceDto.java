package sn.uimcec.intranet.dto;

import lombok.Builder;
import lombok.Data;
import sn.uimcec.intranet.model.Agence;

@Builder
@Data
public class AgenceDto {
    private Integer id;
    private String nom;
    private EntiteDto entite;

    public static AgenceDto fromAgence(Agence agence){
        if(agence==null){
            return null;
        }
        return AgenceDto.builder()
                .id(agence.getId())
                .nom(agence.getNom())
                .entite(EntiteDto.fromEntite(agence.getEntite()))

        .build();
    }

    public static Agence toAgence(AgenceDto dto) {
        Agence agence= new Agence();
        agence.setId(dto.getId());
        agence.setNom(dto.getNom());
        agence.setEntite(EntiteDto.toEntite(dto.getEntite()));
        return agence;

    }
}
