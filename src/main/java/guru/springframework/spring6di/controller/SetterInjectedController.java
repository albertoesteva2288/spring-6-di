package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;
    /*
        ES
        Debido a las varias implementaciones de GreetingService
        al hacer la injeccion de la dependencia se debe usar el @Qualifier
        junto con el  @Autowired sobre el mismo elemento
        ya sea sobre la propiedad, setter o constructor
        Si se coloca en un lado el @Autowired y en otro el @Qualifier
        Spring no sabra que opcion elegir, a menos que se haya definido el
        bean como @Primary en cuyo caso inyectará eso, en caso contrario
        lanzará error.
        EN
        Due to various implementations of GreetingService
         When doing dependency injection you should use the @Qualifier
         along with the @Autowired on the same element
         either on the property, setter or constructor
         If the @Autowired is placed on one side and the @Qualifier on the other
         Spring will not know which option to choose, unless the
         bean as @Primary in which case it will inject that, otherwise
         will throw error.

    * */
    @Autowired
    public void setGreetingService(@Qualifier(value = "greetingServiceSetterInjection") GreetingService greetingService) {
        System.out.println("Injection from setter");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
