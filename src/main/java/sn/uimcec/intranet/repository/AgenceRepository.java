package sn.uimcec.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.uimcec.intranet.model.Agence;

public interface AgenceRepository extends JpaRepository<Agence,Integer> {
}
