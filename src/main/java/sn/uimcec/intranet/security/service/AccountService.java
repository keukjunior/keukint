package sn.uimcec.intranet.security.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import sn.uimcec.intranet.dto.*;
import sn.uimcec.intranet.model.Fonction;
import sn.uimcec.intranet.security.entities.AppUser;

@Service
@Transactional
public interface AccountService {
   // AppUser addNewUser(String username, String password, String email, String confirmPassword, String prenom, String nom, String fonction, Entite entite, Direction direction, Agence agence, PointService pointService);
   AppUserDto addNewUser(String username, String password, String email, String confirmPassword, String prenom, String nom);
    //AppRole addNewRole(String role);
    AppRoleDto addNewRole(String role);

    void addRoleToUser(String username, String role);

    //FonctionDto addNewFonction(FonctionDto fonction);

    FonctionDto addNewFonction(String fonction);
    void addFonctionToUser(String username, String fonction);

    void addEntiteToUser(String username,String entite, String direction, String agence, String pointService);
    void removeRoleFromUser(String username, String role);
    AppUser loadUserByUsername(String username);
    //UserDto loadUserByUsername(String username);
}
