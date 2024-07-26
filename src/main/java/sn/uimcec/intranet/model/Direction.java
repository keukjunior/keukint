package sn.uimcec.intranet.model;


import jakarta.persistence.*;

@Entity
public class Direction {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nom;

    private int identite;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="entite_id")
    private Entite entite;
}
