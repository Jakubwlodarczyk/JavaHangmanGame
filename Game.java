import java.util.ArrayList;


public class Game{
    public ArrayList<String> usedLettersList;

    public Game(){
        this.usedLettersList = new ArrayList<String>();
    }

    public ArrayList<String> getList(){
        return usedLettersList;
    }

    public void addToList(String userInput){
        usedLettersList.add(userInput);
    }


    public static void main(String[] args) {

    }
}
