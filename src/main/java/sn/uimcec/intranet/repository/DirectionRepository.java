package sn.uimcec.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.uimcec.intranet.model.Direction;

public interface DirectionRepository extends JpaRepository<Direction,Integer> {
}
