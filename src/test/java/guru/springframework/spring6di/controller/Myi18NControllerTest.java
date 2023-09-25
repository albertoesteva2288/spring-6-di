package guru.springframework.spring6di.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@ActiveProfiles(value = "ES")
@SpringBootTest
class Myi18NControllerTest {
    @Autowired
    @Qualifier(value = "myi18NController")
    private Myi18NController myi18NController;

    @Test
    void sayHello(){
      System.out.println( myi18NController.sayHello());
    }

}