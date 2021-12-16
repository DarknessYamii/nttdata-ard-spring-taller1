package com.nttdata.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.persistence.NttDataPerson;
import com.nttdata.spring.services.NttDataPersonManagementServiceI;
/**
 * Main Spring
 * @author DarknessYamii
 *
 */
@SpringBootApplication
public class NttSpringMain implements CommandLineRunner {

	@Autowired
	private NttDataPersonManagementServiceI personService;
	
	public static void main(String[] args) {
		SpringApplication.run(NttSpringMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
		NttDataPerson person1 = new NttDataPerson();
		person1.setName("Andres");
		person1.setSurName("Ruiz");
		NttDataPerson person2 = new NttDataPerson();
		person2.setName("Maria del Carmen");
		person2.setSurName("Gonzalez");
		NttDataPerson person3 = new NttDataPerson();
		person3.setName("Javier");
		person3.setSurName("Campos");
		
		personService.insert(person1);
		personService.insert(person2);
		personService.insert(person3);
		
		personService.searchAll().forEach(System.out::println);
		
		System.out.println("|-------------|");
		
		personService.searchByFullName("Andres", "Ruiz").forEach(System.out::println);
	}

}
