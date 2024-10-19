package sn.uimcec.intranet.dto;

import lombok.Builder;
import lombok.Data;
import sn.uimcec.intranet.model.Fonction;

@Data
@Builder
public class FonctionDto {

    private String nom;


    public static FonctionDto fromFonction(Fonction fonction){
        if(fonction == null)
            return null;
        return FonctionDto.builder()
               // .id(fonction.getId())
                .nom(fonction.getFonction())
                //.entite(EntiteDto.fromEntite(agence.getEntite()))

                .build();
    }

    public static Fonction toFonction(FonctionDto dto) {
        Fonction entite= new Fonction();
        //agence.setId(dto.getId());
        //entite.setId(dto.getId());
        entite.setFonction(dto.getNom());
        //entite.setNom(dto.getNom());
        //agence.setNom(dto.getNom());
        //agence.setEntite(EntiteDto.toEntite(dto.getEntite()));
        return entite;

    }
}
