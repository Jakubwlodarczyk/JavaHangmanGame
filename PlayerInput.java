import java.util.Scanner;

public class PlayerInput {
    /**
     * Gets the user input for logic choice
     */
    public static String choice(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = reader.next();
        return input;
    }
    /**
     * Gets the user input of a single a letter
     */
    public static String getLetter(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String input = reader.next();
        Character ch = input.charAt(0);
        String character = ch.toString();
        return character.toUpperCase();
    }
    /**
     * Gets the user input of a whole word
     */
    public static String getWord(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter whole word: ");
        String word = reader.next();
        return word.toUpperCase();
    }

    public static void pressEnterToContinue() {
       System.out.println("Press enter to continue.");
       try {
           System.in.read();
       }
       catch(Exception e) {}
}

public static String playAgain(){
    Scanner reader = new Scanner(System.in);
    System.out.println("Wanna play again? 'Y' to play again.");
    String word = reader.next();
    return word.toUpperCase();
}

}
