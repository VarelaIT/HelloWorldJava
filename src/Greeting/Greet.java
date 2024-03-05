package Greeting;

public class Greet {

    private final String greeting;
    public Greet (String name) {
        this.greeting = "Hello " + name;
    }

    public String getGreet () {
        return this.greeting;
    }
}
