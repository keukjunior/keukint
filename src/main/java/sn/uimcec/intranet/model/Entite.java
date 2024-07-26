package sn.uimcec.intranet.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Entite {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="entite")
    private List<Agence> agenceList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "entite")
    private List<Direction> directionList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy ="entite")
    private List<PointService> pointServiceList;
}
