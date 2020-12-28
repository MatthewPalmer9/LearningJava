/**
 * InneraddIntToString
 */
public class addIntToString {

    public static void main(String[] args) {
        String mySentence = "My current age is: ";
        System.err.println(AgeToString(mySentence, 38));
    }

    public static String AgeToString(String str, Integer age) {
        String ageAsString = age.toString();
        return str + ageAsString;
    }
}
