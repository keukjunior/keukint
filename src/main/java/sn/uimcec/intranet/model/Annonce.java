package sn.uimcec.intranet.model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Annonce implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idannonce;
    private String titre;
    private String contenu;
    private String document;

    private Date datepub;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="categorie_id")
    private Categorie  categorie;
}
