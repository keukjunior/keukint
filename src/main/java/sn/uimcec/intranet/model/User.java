package sn.uimcec.intranet.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
/*@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity*/
//public class User implements Serializable {/*
public class User {/*
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    private String login;
    private String password;

    private String fonction;

    private boolean enable;

    @ManyToOne
    @JoinColumn(name="entite_id")
    private Entite entite;
    @ManyToOne
    @JoinColumn(name="direction_id")
    private Direction direction;
    @ManyToOne
    @JoinColumn(name="agence_id")
    private Agence agence;
    @ManyToOne
    @JoinColumn(name="pointservice_id")
    private PointService pointService;*/



}
