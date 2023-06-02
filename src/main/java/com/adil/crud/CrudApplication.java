package com.adil.crud;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.adil.crud.model.Student;
import com.adil.crud.repo.Studentrepository;


@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(CrudApplication.class, args);
		
	}

}
