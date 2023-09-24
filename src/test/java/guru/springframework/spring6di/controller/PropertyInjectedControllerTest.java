package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.service.impl.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyInjectedControllerTest {

    PropertyInjectedController controller;
    @BeforeEach
    void setup(){
        controller = new PropertyInjectedController();
        System.out.println("Injection from property");
        controller.greetingService = new GreetingServiceImpl();
    }
    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}