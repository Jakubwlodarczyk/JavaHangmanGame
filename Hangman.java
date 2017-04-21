/**
 * Represents main class.
 * Controlls logic of Hangman Game.
 */
public class Hangman {
    /**
     * Controlls methods responsible for printing
     * @ throws InterruptedException if thread is interrupted, either before or
     during the activity of sleeping
     * text introduction to Game into console.
     */
    public static void welcome()
        throws InterruptedException {
            Printer.introText();
            PlayerInput.pressEnterToContinue();
            Printer.howToPlayText();
        }

    /**
     * Controlls the actual game algorithm.
     * @ throws InterruptedException if thread is interrupted, either before or
     during the activity of sleeping
     */
    public static void gameLogic()
        throws InterruptedException{

        Game newGame = new Game();
        Player player = new Player();
        String capital = Converter.convertToDash(newGame.getCapital());

        while (player.getLife() > 0){
            System.out.println("Capital to guess: " + capital);
            System.out.println("Used letters: " + Printer.ANSI_YELLOW +newGame.getList() + Printer.ANSI_RESET);
            System.out.println(Printer.ANSI_CYAN + "Your lives: " + player.getLife() + Printer.ANSI_RESET);
            Printer.whatYouWantToGuess();
            String choice = PlayerInput.choice();

            //handles  the logic after choosing by user to guess letter
            if (choice.equals("1")){
                String letter = PlayerInput.getLetter();
                Printer.clear();
                //user input is first checked for containing any numbers or
                //special characters
                if (!Checker.isNumeric(letter) && !Checker.containsSpecialChar(letter)){
                    //user input is checked for already being in list of used letters
                    if (Checker.isOk(letter, newGame.getList())){
                        newGame.addToList(letter);
                        Boolean isLetterInWord = Checker.hasLetter(letter, newGame.getCapital());
                        if (isLetterInWord){
                            Printer.simplePrint("You guessed it, smart-ass! Go on!");
                            int[] indexes = Checker.listOfIndexes(letter, newGame.getCapital());
                            for (Integer index : indexes) {
                                capital = Converter.convertToLetter(capital, index, letter);
                            }
                            //checking if all letters of word are guessed
                            if (capital.equals(newGame.getCapital())){
                                Printer.simplePrint("Yay! You have won! Congratulations!");
                                System.out.println(Printer.ANSI_GREEN + "Correct answer is:");
                                System.out.println(newGame.getCapital() + Printer.ANSI_RESET);
                                break;
                            }
                        } else {
                            Printer.warningMessage("Nah, that's not it. Try again. You lose 1 life though.");
                            player.changeLife(-1);
                        }
                    } else {
                        Printer.warningMessage("Looks like you have already typed this letter!");
                    }
                } else {
                    Printer.warningMessage("Wrong input! Try again.");
                }

            //handles  the logic after choosing by user to guess a whole word
            } else if (choice.equals("2")){
                String word = PlayerInput.getWord();
                if (!Checker.isNumeric(word) && !Checker.containsSpecialChar(word)){
                    Boolean isCorrect = Checker.isCorrectAnswer(word, newGame.getCapital());
                    if (isCorrect){
                        Printer.simplePrint("Yay! You have won! Congratulations!");
                        System.out.println(Printer.ANSI_GREEN + "Correct answer is:");
                        System.out.println(capital + newGame.getCapital());
                        break;
                    } else {
                        Printer.warningMessage("Nah, not the correct answer OBVIOUSLY. Try again.");
                        player.changeLife(-1);
                    }
                } else {
                    Printer.warningMessage("Wrong input! Try again.");
                }
            //handles  the log

            } else {
                Printer.warningMessage("Invalid input, you moron.");
            }
    }

        if (player.getLife() <= 0){
            Printer.warningMessage("Booooo, you have lost!");
            System.out.println("Correct answer is:");
            System.out.println(Printer.ANSI_RED + newGame.getCapital() + Printer.ANSI_RESET);
            System.out.println("You're not the brightest star on the sky, are you?");
            System.out.println("Let's hope you're pretty.");
            playAgain();
        }
    }

    /**
     * Lets the player to play the game once more after finishing
     * @ throws InterruptedException if thread is interrupted, either before or during the activity of sleeping
     */
    public static void playAgain()
        throws InterruptedException {
        String answer = PlayerInput.playAgain();
        if (answer.equals("Y")){
            Printer.clear();
            gameLogic();
        } else {
            exit();
            }
    }

    /**
    * Stops the program, and leaves the message for user.
    */
    public static void exit()
        throws InterruptedException {
            Printer.simplePrint("If you enjoyed using our program, please support further development by donating 10 000$");
            System.exit(0);
        }

    public static void main(String[] args)
        throws InterruptedException {
            welcome();
            gameLogic();
            playAgain();
    }
}
