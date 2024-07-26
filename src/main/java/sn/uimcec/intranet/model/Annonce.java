package sn.uimcec.intranet.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

import java.io.Serializable;





@Entity
public class Annonce {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idannonce;
    private String titre;
    private String contenu;
    private String document;

    private Date datepub;
}
