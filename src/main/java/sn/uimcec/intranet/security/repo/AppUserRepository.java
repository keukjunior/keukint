package sn.uimcec.intranet.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.uimcec.intranet.security.entities.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser,String> {
    AppUser findByUsername(String username);
}
