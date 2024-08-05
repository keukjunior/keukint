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
public class Agence  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nom;

    @ManyToOne
    @JoinColumn(name="entite_id")
    private Entite entite;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "agence")
    private List<User> userList;
}
