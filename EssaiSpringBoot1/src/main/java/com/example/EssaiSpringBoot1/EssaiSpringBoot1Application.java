package EssaiSpringBoot1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class EssaiSpringBoot1Application implements CommandLineRunner{

	//pourquoi c'est private ?
	// errreur : cannot find symbol
	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(EssaiSpringBoot1Application.class, args);
	}

	//erreur cannot find symbol
	// je pense que les deux erreurs sont liés peut-être un pb de package mais je ne suis pas sûr
	@Override
	public void run(String... args) throws Exception{
		HelloWorld hw = bs.getHelloWorld();
		System.out.println(hw);
	}

}
