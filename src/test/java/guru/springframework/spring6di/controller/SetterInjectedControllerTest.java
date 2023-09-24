package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.service.GreetingService;
import guru.springframework.spring6di.service.impl.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setup(){
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());

    }

    @Test
    void sayHello(){

        System.out.println(controller.sayHello());
    }

}