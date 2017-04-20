import java.util.stream.IntStream;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Handles checking user input.
 */
public class Checker {
    /**
     * Checks if user input of letter occures in the guessed word.
     */
    public static Boolean hasLetter(String userInput, String randomCapital){
        Boolean hasLetter = new Boolean(false);
        if (randomCapital.indexOf(userInput) >= 0){
            hasLetter = true;
        }
        return hasLetter;
    }
    /**
     * Checks if user input of capital is the correct answer.
     */
    public static Boolean isCorrectAnswer(String userInput, String randomCapital){
        return randomCapital.equals(userInput);
    }
    /**
     * Czo to robi to ja nie wiem
     */
    public static int[] listOfIndexes(String userInput, String randomCapital){
        final char key = userInput.charAt(0);
        int[] listOfIndexes = IntStream.range(0, randomCapital.length())
                                 .filter(i -> randomCapital.charAt(i) == key)
                                 .toArray();
        return listOfIndexes;
    }
    /**
     * Checks if user input of letter was already typed.
     */
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
    /**
     * Checks if user input contains any numeric characters
     */
    public static Boolean isNumeric(String str){
        try {
            Double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe){
            return false;
        }
        return true;
        }
    /**
     * Checks if user input contains any special characters besides space.
     */
    public static Boolean containsSpecialChar(String input){
        Pattern pattern = Pattern.compile("[^\\w\\d\\s]");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return true;

        } return false;
    }
}
