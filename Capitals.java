package hangman;
import java.util.Random;

public class Capitals{

    public static String getRandomCapital(List<String> capitals) {
        String randomCapital = capitals.get(new Random().nextInt(list.size()));
        return randomCapital;

    }
    public static void main(String[] args) {

    }
}
