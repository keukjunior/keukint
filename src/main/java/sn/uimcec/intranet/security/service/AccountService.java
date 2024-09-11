package sn.uimcec.intranet.security.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import sn.uimcec.intranet.security.entities.AppRole;
import sn.uimcec.intranet.security.entities.AppUser;
@Service
@Transactional
public interface AccountService {
    AppUser addNewUser(String username,String password, String email, String confirmPassword);
    AppRole addNewRole(String role);
    void addRoleToUser(String username, String role);
    void removeRoleFromUser(String username, String role);

    AppUser loadUserByUsername(String username);
}
