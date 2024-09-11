package sn.uimcec.intranet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import sn.uimcec.intranet.security.service.AccountService;

@SpringBootApplication
public class IntranetApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntranetApplication.class, args);

	}

	//@Bean
	CommandLineRunner commandLineRunnerUsersDetais(AccountService accountService){
		return args -> {
			accountService.addNewRole("USER");
			accountService.addNewRole("ADMIN");
			accountService.addNewRole("DC");
			accountService.addNewUser("user","1234","masps@gmail.com","1234");
			accountService.addNewUser("admin","1234","masps@gmail.com","1234");
			accountService.addNewUser("dc","1234","masps@gmail.com","1234");
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
