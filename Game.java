import java.util.ArrayList;


public class Game{
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
    public static void main(String[] args) {
        // Game n = new Game();
        // System.out.println(n.currentCapital);

    }
}
