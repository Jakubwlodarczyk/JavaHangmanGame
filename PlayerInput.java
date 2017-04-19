import java.util.Scanner;

public class PlayerInput{

    public static char getLetter(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String input = reader.next();
        char character = input.charAt(0);
        return character;
    }

    public static String getWord(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter whole word: ");
        String word = reader.next();
        return word;
    }

}
