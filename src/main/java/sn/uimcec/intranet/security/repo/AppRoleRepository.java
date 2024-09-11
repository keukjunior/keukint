package sn.uimcec.intranet.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.uimcec.intranet.security.entities.AppRole;

public interface AppRoleRepository extends JpaRepository<AppRole,String> {
}
