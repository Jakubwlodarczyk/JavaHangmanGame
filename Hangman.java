
public class Hangman {

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

        while (player.getLife() > 0){
            System.out.println("Capital to guess: " + capital);
            System.out.println("Used letters: " + newGame.getList());
            System.out.println("Your lives: " + player.getLife());
            Printer.whatYouWantToGuess();
            String choice = PlayerInput.choice();


            if (choice.equals("1")){
                String letter = PlayerInput.getLetter();
                Printer.clear();
                if (!Checker.isNumeric(letter)){
                    if (Checker.isOk(letter, newGame.getList())){
                        newGame.addToList(letter);
                        Boolean success = Checker.hasLetter(letter, newGame.getCapital());
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
                    } else {
                        Printer.simplePrint("You have already typed this letter!");
                    }
                } else {
                    Printer.simplePrint("Wrong input! Try again.");
                }



            } else if (choice.equals("2")){
                String word = PlayerInput.getWord();
                if (!Checker.isNumeric(word)){
                    Boolean success = Checker.isCorrectAnswer(word, newGame.getCapital());
                    if (success){
                        Printer.simplePrint("Yay! You have won! Congratulations!");
                        break;
                    } else {
                        Printer.simplePrint("That's not a correct answer! Try again.");
                        player.changeLife(-1);
                    }
                } else {
                    Printer.simplePrint("Wrong input! Try again.");
                }

            } else if (choice.equals ("3")){
                exit();

            } else {
                Printer.simplePrint("Invalid input, you moron.");
            }
    }

        if (player.getLife() <= 0){
            Printer.simplePrint("Booooo, you have lost!");
            playAgain();
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
