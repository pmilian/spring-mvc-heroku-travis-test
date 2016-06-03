package fr.zlandorf.SpringHerokuTest;

/**
 * Created by paul on 03/06/16.
 */
public class Greeting {
    private String greeting;

    public Greeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
