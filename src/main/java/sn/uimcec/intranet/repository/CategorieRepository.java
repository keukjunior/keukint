package sn.uimcec.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.uimcec.intranet.model.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie,Integer> {
}
