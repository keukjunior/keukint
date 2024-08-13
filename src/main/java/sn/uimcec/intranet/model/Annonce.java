package sn.uimcec.intranet.model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;


import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Annonce implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idannonce;
    private String titre;
    private String contenu;
    private String document;

    private Instant datepub;
    @ManyToOne
    @JoinColumn(name="categorie_id")
    private Categorie  categorie;
}
