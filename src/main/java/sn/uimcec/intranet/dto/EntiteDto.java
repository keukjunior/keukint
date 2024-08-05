package sn.uimcec.intranet.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import sn.uimcec.intranet.model.Entite;

import java.util.List;
@Builder
@Data
public class EntiteDto {
    private Integer id;
    private String nom;
    @JsonIgnore
    private List<AgenceDto> agenceList;
    @JsonIgnore
    private List<DirectionDto> directionList;
    @JsonIgnore
    private List<PointServiceDto> pointServiceList;

    public static EntiteDto fromEntite(Entite entite){
        if(entite == null)
            return null;
        return EntiteDto.builder()
                .id(entite.getId())
                .nom(entite.getNom())
                .build();

    }

    public static Entite toEntite(EntiteDto dto){
        if(dto == null)
            return null;
        Entite entite = new Entite();
        entite.setId(dto.getId());
        entite.setNom(dto.getNom());
        return entite;
    }

}
