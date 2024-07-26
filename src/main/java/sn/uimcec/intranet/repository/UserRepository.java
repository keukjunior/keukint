package sn.uimcec.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.uimcec.intranet.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
