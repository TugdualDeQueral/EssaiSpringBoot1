package EssaiSpringBoot1.EssaiSpringBoot1.service;

import EssaiSpringBoot1.EssaiSpringBoot1.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService{

    public HelloWorld getHelloWorld(){
        HelloWorld hw = new HelloWorld();
        return hw;
    }
}