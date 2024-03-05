import Greeting.Greet;

public class App {
    public static void main (String[] args) {

        System.out.println("Hello World from Java!\n");

        Greet greetMyName = new Greet("Ismael");

        System.out.println(greetMyName.getGreet());

    }
}
