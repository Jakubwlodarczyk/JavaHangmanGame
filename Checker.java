import java.util.stream.IntStream;
import java.util.List;

public class Checker{

    public static Boolean hasLetter(String userInput, String randomCapital){
        Boolean haveLetter = new Boolean(false);
        if (randomCapital.indexOf(userInput) >= 0){
            haveLetter = true;
        }
        return haveLetter;
    }

    public static Boolean isCorrectAnswer(String userInput, String randomCapital){
        return randomCapital.equals(userInput);
    }

    public static int[] listOfIndexes(String userInput, String randomCapital){

        final char key = userInput.charAt(0);
        int[] listOfIndexes = IntStream.range(0, randomCapital.length())
                                 .filter(i -> randomCapital.charAt(i) == key)
                                 .toArray();
        return listOfIndexes;
    }

    public static void main(String[] args) {

    }
}
