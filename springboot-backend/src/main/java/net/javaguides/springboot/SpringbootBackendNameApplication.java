package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendNameApplication implements CommandLineRunner{

	public static void main(String[] args) {
		System.out.println("Entry into - SpringbootBackendNameApplication - main() - method ");
		SpringApplication.run(SpringbootBackendNameApplication.class, args);
		System.out.println("Exit from the - SpringbootBackendNameApplication - main() - method");
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userRepository.save(new User("Sri", "Rama", "rama11@gmail.com"));
		userRepository.save(new User("Raghu", "Rama", "rama12@gmail.com"));
		userRepository.save(new User("Sita", "Rama", "rama13@gmail.com"));
		userRepository.save(new User("ayodhya", "Rama", "rama14@gmail.com"));
		userRepository.save(new User("saketh", "Rama", "rama15@gmail.com"));
		this.userRepository.save(new User("dhasaradha", "Rama", "rama16@gmail.com"));
	}

}
