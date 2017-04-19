package hangman;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Capitals{

    public static List<String> capitalsList(){

        List<String> capitalsList = new ArrayList<String>(Arrays.asList("TIRANA", "ANDORRA LA VELLA", "YEREVAN", "VIENNA",
                        "BAKU", "MINSK", "BRUSSELS", "SARAJEVO", "SOFIA",
                        "ZAGREB", "NICOSIA", "PRAGUE", "COPENHAGEN", "TALLINN",
                        "HELSINKI", "PARIS", "TBILISI", "BERLIN", "ATHENS",
                        "BUDAPEST", "REYKJAVIK", "DUBLIN", "ROME", "ASTANA",
                        "PRISTINA", "RIGA", "VADUZ", "VILNIUS", "LUXEMBOURG",
                        "SKOPJE", "VALLETTA", "CHISINAU", "MONACO", "PODGORICA",
                        "AMSTERDAM", "OSLO", "WARSAW", "LISBON", "BUCHAREST",
                        "MOSCOW", "SAN MARINO", "BELGRADE", "BRATISLAVA",
                        "LJUBLJANA", "MADRID", "STOCKHOLM", "BERN", "ANKARA",
                        "KYIV", "LONDON", "VATICAN CITY"));
        return capitalsList;
    }

    public static String getRandomCapital(List<String> capitalsList) {
        String randomCapital = capitalsList.get(new Random().nextInt(capitalsList.size()));
        return randomCapital;

    }

    public static void main(String[] args) {
        List<String> capitals = capitalsList();
        String random = getRandomCapital(capitals);
        System.out.println(random);


    }
}
