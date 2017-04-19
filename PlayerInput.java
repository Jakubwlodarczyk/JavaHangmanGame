import java.util.Scanner;

public class PlayerInput{

    public static String getLetter(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String input = reader.next();
        Character ch = input.charAt(0);
        String character = ch.toString();
        return character;
    }

    public static String getWord(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter whole word: ");
        String word = reader.next();
        return word;
    }

    public static void pressAnyKeyToContinue() {
       System.out.println("Press any key to continue.");
       try {
           System.in.read();
       }
       catch(Exception e) {}
}

}
