package sn.uimcec.intranet.dto;


import lombok.Builder;
import lombok.Data;
import sn.uimcec.intranet.model.Entite;

@Builder
@Data
public class EntiteDto {

    private Integer id;
    private String nom;
    private EntiteDto entite;

    public static EntiteDto fromEntite( Entite entite){

        return EntiteDto.builder()
                .id(entite.getId())
                .nom(entite.getNom())
                //.entite(EntiteDto.fromEntite(agence.getEntite()))

                .build();
    }

    public static Entite toEntite(EntiteDto dto) {
        Entite entite= new Entite();
        //agence.setId(dto.getId());
        entite.setId(dto.getId());
        entite.setNom(dto.getNom());
        //agence.setNom(dto.getNom());
        //agence.setEntite(EntiteDto.toEntite(dto.getEntite()));
        return entite;

    }
}
