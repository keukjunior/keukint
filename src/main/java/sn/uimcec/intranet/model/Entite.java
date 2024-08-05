package sn.uimcec.intranet.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Entite  implements Serializable {
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "entite")
    private List<User> userList;
}
