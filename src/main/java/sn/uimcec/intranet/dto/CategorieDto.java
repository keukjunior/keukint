package sn.uimcec.intranet.dto;


import lombok.Builder;
import lombok.Data;
import sn.uimcec.intranet.model.Categorie;

import java.util.List;

@Builder
@Data
public class CategorieDto {
    private Integer id;
    private String nom;

    List<AnnonceDto> annonceDtoList;

    public static CategorieDto fromCategorie(Categorie cat){
        if(cat == null)
            return null;
        return CategorieDto.builder()
                .id(cat.getId())
                .nom(cat.getNom())
                .build();

    }

    public static Categorie toCategorie(CategorieDto dto){
        if(dto == null)
            return null;
        Categorie cat = new Categorie();
        cat.setId(dto.getId());
        cat.setNom(dto.getNom());
        return cat;
    }
}
