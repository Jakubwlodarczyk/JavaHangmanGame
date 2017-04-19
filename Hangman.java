
public class Hangman{
    public static void welcome()
        throws InterruptedException {
            Printer.introText();
            PlayerInput.pressAnyKeyToContinue();
            Printer.howToPlayText();
            PlayerInput.pressAnyKeyToContinue();
        }
    public static void gameLogic(){
        // tutaj sie wszystko rozgrywa
        // stworzyć obiekt gry
        // storzyć obiekt stolicy itd
    }
    public static void main(String[] args)
        throws InterruptedException{
            welcome();


    }
}
