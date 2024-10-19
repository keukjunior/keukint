package sn.uimcec.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.uimcec.intranet.model.Entite;
import sn.uimcec.intranet.model.PointService;

public interface PointServiceRepository extends JpaRepository<PointService,Integer> {
    PointService findByNom(String pointServices);
}
