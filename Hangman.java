
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
            Printer.simplePrint("Your capital is:");
            Printer.simplePrint(capital);
            Printer.simplePrint("Used letters: ");
            System.out.println(newGame.getList());
            Printer.simplePrint("Your lives:");
            Printer.simplePrint(player.getLife().toString());
            Printer.whatYouWantToGuess();
            String choice = PlayerInput.choice();
            if (choice.equals("1")){
                String letter = PlayerInput.getLetter();
                newGame.addToList(letter);
                boolean success = Checker.hasLetter(letter, newGame.getCapital());
                if (success){
                    int[] indexes = Checker.listOfIndexes(letter, newGame.getCapital());
                    for (Integer index : indexes) {
                        capital = Converter.convertToLetter(capital, index, letter);
                    }
                } else {
                    player.changeLife(-1);
                }


            } else if (choice.equals("2")){
                String word = PlayerInput.getWord();

            } else if (choice.equals ("3")){
                System.exit(0);
            } else { Printer.simplePrint("Invalid input, you moron.");}

        }

    }

    public static void main(String[] args)
        throws InterruptedException{
            // welcome();
            gameLogic();


    }
}
