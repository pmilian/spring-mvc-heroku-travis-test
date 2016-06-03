package fr.zlandorf.SpringHerokuTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello")
    public Greeting sayHello() {
        return new Greeting("Hello");
    }

}
