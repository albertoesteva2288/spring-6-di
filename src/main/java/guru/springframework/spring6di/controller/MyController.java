package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.service.GreetingService;
import guru.springframework.spring6di.service.impl.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    protected MyController(){
        greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in the controller");
        return greetingService.sayGreeting();
    }
}
