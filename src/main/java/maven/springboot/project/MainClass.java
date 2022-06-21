package maven.springboot.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context = SpringApplication.run(MainClass.class,args);
			
			
	}

}
