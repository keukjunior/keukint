package sn.uimcec.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.uimcec.intranet.model.Agence;
import sn.uimcec.intranet.model.Entite;


public interface EntiteRepository  extends JpaRepository<Entite,Integer> {
    Entite findByNom(String entite);
}
