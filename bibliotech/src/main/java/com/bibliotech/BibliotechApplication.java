package com.bibliotech;

import com.bibliotech.application.AdminUseCaseImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BibliotechApplication implements CommandLineRunner {

	private final AdminUseCaseImpl adminUseCase;

    public BibliotechApplication(AdminUseCaseImpl adminUseCase) {
        this.adminUseCase = adminUseCase;
    }

    public static void main(String[] args) {
		SpringApplication.run(BibliotechApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if(args.length > 0){
			switch (args[0]){
				case "cadastrar-admin":
					cadastrarAdminFromCommandLine(args);
					break;
				default:
					System.out.println("Command not recognized" + args[0]);
					break;
			}

		}
	}

	private void cadastrarAdminFromCommandLine(String[] args) {
		if (args.length != 4){
			System.out.println("Use: cadastrar-admin <name> <email> <password>");
		}

		boolean hasBlankArgs = Arrays.stream(args).anyMatch(String::isBlank);

		if (hasBlankArgs){
			System.out.println("You can't pass a blank argument");
			System.out.println("Use: cadastrar-admin <name> <email> <password>");
			return;
		}

		try{
			adminUseCase.createAdminUser(args[0], args[1], args[2]);
			System.out.println("User admin was created succesfully: " + args[1]);
		} catch (Exception e) {
			System.out.println("Error creating ADMIN user: " + e.getMessage());
		}
	}
}
