package in.rohanit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.rohanit.Repository.UserRepository;
import in.rohanit.entity.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);

		User u1 = new User(101, "Ramu", "male", 26, "India");
		User u2= new User(102,"Raju","male", 26, "India");
		User u3= new User(103,"Ram","male", 26, "India");
		User u4= new User(104,"Joseph","male", 26, "India");
		User u5= new User(105,"Ramu","male", 26, "India");
		User u6= new User(106,"Ramu","male", 26, "India");
		User u7= new User(107,"Ramu","male", 26, "India");
		User u8= new User(108,"Ramu","male", 26, "India");
		User u9= new User(109,"Ramu","male", 26, "India");
		User u10= new User(110,"Ramu","male", 26, "India");
		User u11= new User(111,"Ramu","male", 26, "India");

	}

}
