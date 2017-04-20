import java.util.stream.IntStream;
import java.util.List;
import java.util.ArrayList;

public class Checker {

    public static Boolean hasLetter(String userInput, String randomCapital){

        Boolean hasLetter = new Boolean(false);
        if (randomCapital.indexOf(userInput) >= 0){
            hasLetter = true;
        }
        return hasLetter;
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

    public static Boolean isOk(String letter, ArrayList<String> usedLettersList){
        if (usedLettersList.size() > 0 ){
            for(String character : usedLettersList){
                if (character.trim().contains(letter)){
                    return false;
                }
            }
        }
        return true;
    }

    public static Boolean isNumeric(String str){
        try {
            Double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe){
            return false;
        }
        return true;
        }
}
