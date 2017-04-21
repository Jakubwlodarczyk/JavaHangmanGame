import java.util.concurrent.TimeUnit;

/**
 * Handles displaying String messages to console.
 */
public class Printer {
    /**
     * Clears the screen.
     */
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

        for (int i = 0;
             i < text.length;
             i++) {
            System.out.println(text[i]);
            Thread.sleep(1000);
        };
        PlayerInput.pressEnterToContinue();
        clear();
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

    /**
     * Prints given message to console.
     * @ param String message to be displayed.
     * throws InterruptedException if thread is interrupted, either before or during the activity of sleeping.
     */
    public static void simplePrint(String message)
        throws InterruptedException {
            clear();
            System.out.println(ANSI_GREEN + message + ANSI_RESET);
            System.out.println("\n");
    }

    /**
     * Prints given message to console.
     * @ param String message to be displayed.
     * throws InterruptedException if thread is interrupted, either before or during the activity of sleeping.
     */
     
    public static void warningMessage(String message)
        throws InterruptedException {
            clear();
            System.out.println(ANSI_RED + message + ANSI_RESET);
            System.out.println("\n");
    }

    /**
    * Define strings which changes color of printed text in terminal
    */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
}
