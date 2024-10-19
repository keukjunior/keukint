package sn.uimcec.intranet.security.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import sn.uimcec.intranet.dto.EntiteDto;
import sn.uimcec.intranet.dto.AgenceDto;
import sn.uimcec.intranet.dto.DirectionDto;
import sn.uimcec.intranet.dto.AppUserDto;
import sn.uimcec.intranet.dto.FonctionDto;
import sn.uimcec.intranet.dto.AppRoleDto;


import sn.uimcec.intranet.model.*;
import sn.uimcec.intranet.repository.*;
import sn.uimcec.intranet.security.entities.AppRole;
import sn.uimcec.intranet.security.entities.AppUser;
import sn.uimcec.intranet.security.repo.AppRoleRepository;
import sn.uimcec.intranet.security.repo.AppUserRepository;

import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
    private AppUserRepository appUserRepository;
    private AppRoleRepository appRoleRepository;
    private FonctionRepository fonctionRepository;
    private EntiteRepository entiteRepository;
    private DirectionRepository directionRepository;
    private AgenceRepository agenceRepository;
    private PointServiceRepository pointServiceRepository;
    private PasswordEncoder passwordEncoder;

    /* public AccountServiceImpl(AppUserRepository appUserRepository, AppRoleRepository appRoleRepository) {
         this.appUserRepository = appUserRepository;
         this.appRoleRepository = appRoleRepository;
     }*/
    //, String fonction, String entite, String direction, String agence, String pointService
    @Override
    //public AppUser addNewUser(String username, String password, String email, String confirmPassword, String prenom, String nom, String fonction, Entite entite, Direction direction, Agence agence, PointService pointService) {
    public AppUserDto addNewUser(String username, String password, String email, String confirmPassword, String prenom, String nom) {
        //AppUser appUser=appUserRepository.findByUsername(username);
        // UserDto userDto = appUserRepository.findByUsername(username).map(UserDto::fromUser);

    /*   UserDto userDto= UserDto.fromUser(
                appUserRepository.findByUsername(username)
        );*/
        AppUserDto userDto = AppUserDto.fromUser(
                appUserRepository.findByUsername(username)
        );


       /* return Articledto.fromEntity(
                articlerepository.save(Articledto.toEntity(dto))

        );*/

        //if(appUser!=null) throw new RuntimeException("this user already exist");
        if (userDto != null) throw new RuntimeException("this user already exist");
        if (!password.equals(confirmPassword)) throw new RuntimeException("Passwords not match");

        userDto = AppUserDto.builder()
                .id(UUID.randomUUID().toString())
                .username(username)
                .password(passwordEncoder.encode(password))
                .email(email)
                .prenom(prenom)
                .nom(nom)

                .build();
        //UserDto savedAppUser = appUserRepository.save(
        // UserDto.toUser(userDto)
        // );

        AppUserDto savedAppUser = AppUserDto.fromUser(appUserRepository.save(AppUserDto.toUser(userDto)));
        //UserDto.fromUser(
        // appUserRepository.findByUsername(username)
        //appUserRepository.save(userDto)

        //);

       /* return Articledto.fromEntity(
                articlerepository.save(Articledto.toEntity(dto))

        );*/

        // appUserRepository.save(appUser);
        return savedAppUser;
    }

    @Override
    //public AppRole addNewRole(String role) {
    public AppRoleDto addNewRole(String role) {
        if (role == null) return null;
        Optional<AppRole> role1 = appRoleRepository.findById(role);
        /*if(role1.isPresent()){


            throw new RuntimeException("This role already exist");
        }*/
        //if(role1==null && role1.isEmpty()){

        if (role1.isEmpty()) {

            // AppRoleDto appRole= AppRoleDto.fromRole(role1.get());
            //AppRoleDto appRole= AppRoleDto.fromRole(appRoleRepository.findById(role).get());
            // if(appRole!=null) throw new RuntimeException("This role already exist");
      /*  appRole = AppRole.builder()
                .role(role)
                .build();*/
            AppRoleDto appRole;

            appRole = AppRoleDto.builder()
                    .rolesdto(role)
                    .build();

            AppRoleDto appRoleDto = AppRoleDto.fromRole(appRoleRepository.save(AppRoleDto.toRole(appRole)));
            //return appRoleRepository.save(appRole);
            return appRoleDto;
        } else throw new RuntimeException("This role already exist");


    }

    @Override
    public void addRoleToUser(String username, String role) {
        AppUser appUser = appUserRepository.findByUsername(username);
        AppRole appRole = appRoleRepository.findById(role).get();
        appUser.getRoles().add(appRole);
        //appUserRepository.save(appUser); c'est pas la peine parce que @Transaction qui fait la mise à jour aprés commit

    }

    @Override
    public FonctionDto addNewFonction(String fonction) {
        if (fonction == null)
            return null;

        Optional<Fonction> fonction1 = fonctionRepository.findById(fonction);
        if (fonction1.isEmpty()) {
            FonctionDto fonctionDto = FonctionDto.builder()
                    .nom(fonction)
                    .build();
            FonctionDto fonctionDto1 = FonctionDto.fromFonction(fonctionRepository.save(FonctionDto.toFonction(fonctionDto)));
            return fonctionDto1;
        }
        else throw new RuntimeException("This la fonction already exist");
    }




        //else
           // return null;
        //AppRoleDto appRole= AppRoleDto.fromRole(appRoleRepository.findById(role).get());
        //FonctionDto fonctionDto = FonctionDto.fromFonction(fonctionRepository.save(FonctionDto.toFonction(fonction).));
       // FonctionDto fonctionDto =  FonctionDto.fromFonction(fonctionRepository.save(FonctionDto.toFonction(fonction)));
        //if(fonctionDto!=null) throw new RuntimeException("Cette fonction exite dèja");
       // return fonctionDto;
       // return null;
       //Optional<Fonction> fonction1= fonctionRepository.findById(Integer.valueOf(fonction));
       // List<String> errors = FonctionValidator.validate(fonction);
       // if(!errors.isEmpty()){
          //  throw new RuntimeException("La fonction n'est pas valide");
           // log.error("La fonction n'est pas valided",dto);
            //throw new InvalidEntityException("L'annonce n'est pas valide", ErrorCodes.ANNONCE_NOT_VALID,errors);
       // }
       // return
          //      FonctionDto.fromFonction(
           //             fonctionRepository.save(
           //                     FonctionDto.toFonction(fonction)
           //             )

        //);

        //return null;
    //}

    @Override
    public void addFonctionToUser(String username, String fonction) {
        AppUser appUser = appUserRepository.findByUsername(username);
        //Optional<FonctionDto> fonctionDto = FonctionDto.fromFonction(fonctionRepository.findById(fonction));
        Optional<Fonction> fonction1 = fonctionRepository.findById(fonction);
        if(fonction1.isPresent()) {

            //appUser.setFonction(fonctionDto);
            appUser.setFonction(fonction1.get());
        }
        //else
           // throw new RuntimeException("cette fonction existe dans la base de données");
        //FonctionDto fonctionDto = FonctionDto.fromFonction(fonctionRepository.findBy(FonctionDto.toFonction(fonction).getId()).get());
        //FonctionDto fonctionDto = FonctionDto.fromFonction(fonctionRepository.findBy(FonctionDto.toFonction(fonction).getId()));

    }

    @Override
    public void addEntiteToUser(String username, String entite, String direction, String agence, String pointService) {
        AppUser appUser = appUserRepository.findByUsername(username);
        Optional<Direction> direction1= Optional.ofNullable(directionRepository.findByNom(direction));
        if(direction1.isPresent()){
            appUser.setDirection(direction1.get());
        }
        Optional<Entite> entite1 = Optional.ofNullable(entiteRepository.findByNom(entite));
        if (entite1.isPresent()){
            appUser.setEntite(entite1.get());
        }

        Optional<Agence> agence1 = Optional.ofNullable(agenceRepository.findByNom(agence));
        if(agence1.isPresent()){
            appUser.setAgence(agence1.get());
        }

        Optional<PointService> pointService1 = Optional.ofNullable(pointServiceRepository.findByNom(pointService));
        if(pointService1.isPresent()){
            appUser.setPointService(pointService1.get());
        }
      /*  DirectionDto dto = DirectionDto.fromDirection(directionRepository.findByNom(direction));
        if(dto==null) throw new RuntimeException("cette Direction n'est pas valide");
        appUser.setDirection(DirectionDto.toDirection(dto));
        EntiteDto entitedto = EntiteDto.fromEntite(entiteRepository.findByNom(entite));
        if(entitedto==null) throw new RuntimeException("cette Entite n'est pas valide");
        appUser.setEntite(EntiteDto.toEntite(entitedto));
        AgenceDto agencedto = AgenceDto.fromAgence(agenceRepository.findByNom(agence));
        if(agencedto==null) throw new RuntimeException("cette Agence n'est pas valide");
        appUser.setAgence(AgenceDto.toAgence(agencedto));*/
      /* PointServiceDto point = PointServiceDto.fromPointService(pointServiceRepository.findByNom(pointService));
        if(point==null) throw new RuntimeException("cet  point de service n'est pas valide");
        appUser.setPointService(PointServiceDto.toPointService(point));*/
    }

    @Override
    public void removeRoleFromUser(String username, String role) {
        AppUser appUser = appUserRepository.findByUsername(username);
        AppRole appRole = appRoleRepository.findById(role).get();
        appUser.getRoles().remove(appRole);

    }

    @Override
    public AppUser loadUserByUsername(String username) {
       return appUserRepository.findByUsername(username);
    }
         /*public UserDto loadUserByUsername(String username){
             return UserDto.fromUser(appUserRepository.findByUsername(username));
         }*/
}
