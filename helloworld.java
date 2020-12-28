/**
 * helloworld
 */
public class helloworld {

    public static void main(String[] args) {
        String exclaim = addExclamationPoint("Hello world");
        System.out.println(exclaim);
    }

    public static String addExclamationPoint(String s) {
        return s + "!";
    }
}