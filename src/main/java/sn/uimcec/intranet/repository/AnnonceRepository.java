package sn.uimcec.intranet.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import sn.uimcec.intranet.model.Annonce;

public interface AnnonceRepository extends JpaRepository<Annonce,Integer> {
}
