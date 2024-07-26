package sn.uimcec.intranet.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    private String login;
    private String password;

    private String fonction;

    private boolean enable;
    private int enti_id;
    private int servi;
    private int agen_id;
    private int senti_id;



}
