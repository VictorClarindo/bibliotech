package com.bibliotech;

import com.bibliotech.application.AdminUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BibliotechApplication {

    public static void main(String[] args) {
		SpringApplication.run(BibliotechApplication.class, args);
	}
}
