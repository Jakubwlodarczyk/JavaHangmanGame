
public class Checker{

    public static Boolean haveLetter(String userInput, String randomCapital){
        Boolean haveLetter = new Boolean(false);
        if (randomCapital.indexOf(userInput) >= 0){
            haveLetter = true;
        }
        return haveLetter;
    }

    public static Boolean isCorrectAnswer(String userInput, String randomCapital){
        return randomCapital.equals(userInput);
    }

    public static void main(String[] args) {

    }
}
