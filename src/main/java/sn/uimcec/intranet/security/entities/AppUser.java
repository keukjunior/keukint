package sn.uimcec.intranet.security.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.uimcec.intranet.model.*;


import java.util.List;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class AppUser {
    @Id
    private String userId;
    @Column(unique = true)
    private String username;
    private String password;
    private String email;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<AppRole> roles;





    private String nom;
    private String prenom;


    //private String fonction;
    //private String entite;
    //private String direction;
    //private String agence;
   // private String pointservice;

    private boolean enable;
    @ManyToOne
    @JoinColumn(name="fonction_id")
    private Fonction fonction;

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
    private PointService pointService;

}
