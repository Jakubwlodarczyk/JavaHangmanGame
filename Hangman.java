
public class Hangman{

    public static void welcome()
        throws InterruptedException {
            Printer.introText();
            PlayerInput.pressEnterToContinue();
            Printer.howToPlayText();
        }

    public static void gameLogic()
        throws InterruptedException{

        Game newGame = new Game();
        Player player = new Player();
        String capital = Converter.convertToDash(newGame.getCapital());
        boolean isGame = true;

        while (isGame && player.getLife() > 0){
            System.out.println("Capital to guess: " + capital);
            System.out.println("Used letters: " + newGame.getList());
            System.out.println("Your lives: " + player.getLife() );
            // Printer.simplePrint(player.getLife().toString());
            Printer.whatYouWantToGuess();
            String choice = PlayerInput.choice();


            if (choice.equals("1")){
                String letter = PlayerInput.getLetter();
                Printer.clear();
                newGame.addToList(letter);
                boolean success = Checker.hasLetter(letter, newGame.getCapital());
                if (success){
                    int[] indexes = Checker.listOfIndexes(letter, newGame.getCapital());
                    for (Integer index : indexes) {
                        capital = Converter.convertToLetter(capital, index, letter);
                    }
                    if (capital.equals(newGame.getCapital())){
                        Printer.simplePrint("Yay! You have won! Congratulations!");
                        break;
                    }
                } else {
                    player.changeLife(-1);
                }

            } else if (choice.equals("2")){
                String word = PlayerInput.getWord();
                boolean success = Checker.isCorrectAnswer(word, newGame.getCapital());
                if (success){
                    Printer.simplePrint("Yay! You have won! Congratulations!");
                    break;
                } else {
                    player.changeLife(-1);
                }

            } else if (choice.equals ("3")){
                exit();

            } else {
                Printer.simplePrint("Invalid input, you moron.");
            }
    }

        if (player.getLife() <= 0){
            Printer.simplePrint("Booooo, you have lost!");
        }
    }

    public static void playAgain()
        throws InterruptedException {
        String answer = PlayerInput.playAgain();
        if (answer.equals("Y")){
            gameLogic();
        } else {
            exit();
            }
    }

    public static void exit()
        throws InterruptedException {
            Printer.simplePrint("If you enjoyed using our program, please support further development by donating 10 000$");
            System.exit(0);
        }

    public static void main(String[] args)
        throws InterruptedException {
            // welcome();
            gameLogic();
            playAgain();
    }
}
