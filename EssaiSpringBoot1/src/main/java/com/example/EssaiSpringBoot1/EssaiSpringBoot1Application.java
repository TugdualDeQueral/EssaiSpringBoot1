package EssaiSpringBoot1;
package EssaiSpringBoot1.src.main.java.com.example.EssaiSpringBoot1.model.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class EssaiSpringBoot1Application implements CommandLineRunner{

	//pourquoi c'est private ?
	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(EssaiSpringBoot1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		HelloWorld hw = bs.getHelloWorld();
		System.out.println(hw);
	}

}
