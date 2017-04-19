
public class Hangman{
    public static void welcome()
        throws InterruptedException {
            Printer.introText();
            PlayerInput.pressAnyKeyToContinue();
            Printer.howToPlayText();
            PlayerInput.pressAnyKeyToContinue();
        }
    public static void gameLogic(){
        Game newGame = new Game();

    }
    
    public static void main(String[] args)
        throws InterruptedException{
            welcome();


    }
}
