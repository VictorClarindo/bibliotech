package com.bibliotech.infrastructure.cli;

import com.bibliotech.adapters.output.persistence.UserRepositoryImpl;
import com.bibliotech.application.AdminUseCaseImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class adminCreation implements CommandLineRunner {

    private final AdminUseCaseImpl adminUseCase;

    public adminCreation(AdminUseCaseImpl adminUseCase) {
        this.adminUseCase = adminUseCase;
    }

    @Override
    public void run(String... args) throws Exception {
        adminUseCase.createAdminUser(args[0], args[1], args[2]);
    }
}
