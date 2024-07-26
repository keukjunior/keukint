package sn.uimcec.intranet.model;


import jakarta.persistence.*;

@Entity
public class PointService {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nom;

    private int identite;
    private int idagence;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="agence_id")
    private Agence agence;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="entite_id")

    private Entite entite;
}
