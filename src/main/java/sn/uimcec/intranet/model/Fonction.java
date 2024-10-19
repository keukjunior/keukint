package sn.uimcec.intranet.model;

import jakarta.persistence.*;
import lombok.*;
import sn.uimcec.intranet.security.entities.AppUser;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Fonction implements Serializable {
   // @Id
    //@GeneratedValue(strategy= GenerationType.IDENTITY)
    //private Integer id;
    @Id
    private String fonction;
    @OneToMany(fetch = FetchType.LAZY, mappedBy ="fonction")
    private List<AppUser> userList;
}
