package sn.uimcec.intranet.dto;

import lombok.Builder;
import lombok.Data;
import sn.uimcec.intranet.model.Annonce;
import sn.uimcec.intranet.model.PointService;

import java.util.Date;

@Builder
@Data
public class AnnonceDto {
    private Integer idannonce;
    private String titre;
    private String contenu;
    private String document;

    private Date datepub;

    private CategorieDto categorieDto;


    public static AnnonceDto fromAnnonce(Annonce ser){
        if(ser == null)
            return null;
        return AnnonceDto.builder()
                .idannonce(ser.getIdannonce())
                .titre(ser.getTitre())
                .contenu(ser.getContenu())
                .document(ser.getDocument())
                .datepub(ser.getDatepub())
                .categorieDto(CategorieDto.fromCategorie(ser.getCategorie()))
                        .build();

    }

    public static Annonce toAnnonce(AnnonceDto dto){
        if(dto == null)
            return null;
        Annonce dire = new Annonce();
        dire.setIdannonce(dto.getIdannonce());
        dire.setTitre(dto.getTitre());
        dire.setContenu(dto.getContenu());
        dire.setDocument(dto.getDocument());
        dire.setDatepub(dto.getDatepub());
        dire.setCategorie(CategorieDto.toCategorie(dto.getCategorieDto()));

        return dire;
    }
}
