import java.util.concurrent.TimeUnit;

public class Printer{

    public static void introText()
        throws InterruptedException {
            String text [] = {
                "Hello Stranger!",
                "Welcome to the Hangman Game!",
                "We are so excited!!!",
                "Let's play then!",
                "Because that's why we're here, right?"
            };

        for (int i = 0;
             i < text.length;
             i++) {
            System.out.println(text[i]);
            Thread.sleep(2000);
        };
    }

    public static void howToPlayText()
        throws InterruptedException {
            String text [] = {
                "Your job is to guess the capital of an European Country",
                "Seems easy, doesn't it?",
                "Let's see how smart you are!",
                "Ready?",
                };

        for (int i = 0;
             i < text.length;
             i++) {
            System.out.println(text[i]);
            Thread.sleep(2000);
        };
    }



}
