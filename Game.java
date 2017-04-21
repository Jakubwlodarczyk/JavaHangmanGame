import java.util.ArrayList;

/**
* Class Game, represents game object with 2 attributes:
* - usedLetterList (List with strings, used by a played in game)
* - currentCapital (String: randomly choosen Capital name, from Capitals List)
*/
public class Game {
    public ArrayList<String> usedLettersList;
    public String currentCapital;

    public Game(){
        this.usedLettersList = new ArrayList<String>();
        this.currentCapital = Capitals.getRandomCapital();
    }

    public ArrayList<String> getList(){
        return usedLettersList;
    }

    public void addToList(String userInput){
        usedLettersList.add(userInput);
    }

    public String getCapital(){
        return currentCapital;
    }
}
