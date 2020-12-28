import java.util.ArrayList;

/**
 * helloworld
 */
public class helloworld {

    public static void main(String[] args) {
        String exclaim = addExclamationPoint("Hello world");
        System.out.println(exclaim);

        // Getting from Animal.java
        Animal a = new Animal();
        String dog = a.iAmDog();
        System.out.println(dog);
    }

    public static String addExclamationPoint(String s) {
        return s + "!";
    }
}