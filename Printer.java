import java.util.concurrent.TimeUnit;

public class Printer{

    public static void clear() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

    public static void introText()
        throws InterruptedException {
            String text [] = {
                "Hello Stranger!",
                "Welcome to the Hangman Game!",
                "We are so excited!!!",
                "Let's play then!",
                "Because that's why we're here, right?"
            };
        clear();
        for (int i = 0;
             i < text.length;
             i++) {
            System.out.println(text[i]);
            Thread.sleep(1000);
            };
    }

    public static void howToPlayText()
        throws InterruptedException {
            String text [] = {
                "Your job is to guess the capital of an European Country.",
                "Seems easy, doesn't it?",
                "Let's see how smart you are!",
                "Ready?" ,
                " "};
        clear();
        for (int i = 0;
             i < text.length;
             i++) {
            System.out.println(text[i]);
            Thread.sleep(1000);
        };
    }
    public static void whatYouWantToGuess()
        throws InterruptedException {
            String text [] = {
                "",
                "What do you want to guess?",
                "1. Letter.",
                "2. Whole word.",
                "3. Help, I want to quit the game NOW.",
                "",
                };

        for (int i = 0;
             i < text.length;
             i++) {
            System.out.println(text[i]);
            };
    }

    public static void simplePrint(String message)
        throws InterruptedException {
            clear();
            System.out.println(message);
            System.out.println("\n");
    }

}
