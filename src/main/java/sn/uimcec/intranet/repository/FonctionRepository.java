package sn.uimcec.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.uimcec.intranet.model.Fonction;

public interface FonctionRepository extends JpaRepository<Fonction,String> {
    //Fonction findByNom(String fonction);
}
