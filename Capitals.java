import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Capitals {

    /**
    * @return the List<String> with Capital cities names
    */
    public static List<String> getCapitalsList(){

        List<String> capitalsList = new ArrayList<String>(Arrays.asList("VATICAN CITY"));
        return capitalsList;
    }

    /**
    * @return random choosen Capital name, from list
    */
    public static String getRandomCapital() {
        List<String> capitalsList = getCapitalsList();
        String randomCapital = capitalsList.get(new Random().nextInt(capitalsList.size()));
        return randomCapital;
    }

}
