package sn.uimcec.intranet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import sn.uimcec.intranet.dto.*;
import sn.uimcec.intranet.model.Agence;
import sn.uimcec.intranet.model.Direction;
import sn.uimcec.intranet.model.Entite;
import sn.uimcec.intranet.model.PointService;
import sn.uimcec.intranet.security.service.AccountService;
import sn.uimcec.intranet.service.DirectionService;
import sn.uimcec.intranet.service.EntiteService;

@SpringBootApplication
public class IntranetApplication {
	private DirectionService directionService;

	public static void main(String[] args) {
		SpringApplication.run(IntranetApplication.class, args);


	}

	@Bean
	CommandLineRunner commandLineRunnerUsersDetais(AccountService accountService){
		return args -> {

		/*	EntiteDto entitedto;
					entitedto = EntiteDto.builder()
					.id(null)
					.nom("Imcec Dakar").build();



			DirectionDto directionDto = DirectionDto.builder()
					.id(null)
					.nom("DSI")
					.entite(entitedto)
					.build();

			AgenceDto agenceDto =  AgenceDto.builder()
					.id(null)
					.nom("Liberté6")
					.entite(entitedto)

					.build();

			PointServiceDto pointServiceDto = PointServiceDto.builder()
					.id(null)
					.nom("Ouakam")
					.agence(agenceDto)
					.entite(entitedto)
					.build();
*/

			//Entite entite= new Entite();
			//UserDto user = new UserDto("null","user","user1","user","1234");


			accountService.addNewRole("USER");
			accountService.addNewRole("ADMIN");
			accountService.addNewRole("DC");
			accountService.addNewUser("user", "1234", "masps@gmail.com", "1234", "user1", "usernom1");
			accountService.addNewUser("user1", "1234", "masps@gmail.com", "1234", "user2", "usernom2");
			accountService.addNewUser("admin","1234","masps@gmail.com","1234","admin","admin");
			accountService.addNewUser("dc","1234","masps@gmail.com","1234","dc","dc");
			accountService.addFonctionToUser("user","Caissier");
			accountService.addFonctionToUser("user1","Comptable");
			accountService.addFonctionToUser("admin","Adminnistrateur");
			accountService.addFonctionToUser("dc","Directeur Communication");
			accountService.addEntiteToUser("user","Imcec Dakar","null","Liberté6","Ouakam");
			accountService.addEntiteToUser("user1","Imcec Thies","null","Moda Kane","Diami khaleyi");
			accountService.addEntiteToUser("admin","UNION","DSI","null","null");
			accountService.addEntiteToUser("dc","UNION","DRH","null","null");



			accountService.addRoleToUser("user","USER");
			accountService.addRoleToUser("admin","ADMIN");
			accountService.addRoleToUser("admin","USER");
			accountService.addRoleToUser("dc","DC");
			accountService.addRoleToUser("dc","USER");


		};
	}
    @Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

}
