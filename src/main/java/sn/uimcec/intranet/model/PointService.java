package sn.uimcec.intranet.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.uimcec.intranet.security.entities.AppUser;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class PointService implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nom;



    @ManyToOne
    @JoinColumn(name="agence_id")
    private Agence agence;
    @ManyToOne
    @JoinColumn(name="entite_id")
    private Entite entite;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pointService")
    private List<AppUser> userList;
}
