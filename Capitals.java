import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Capitals{

    public static List<String> getCapitalsList(){

        List<String> capitalsList = new ArrayList<String>(Arrays.asList("TIRANA",
                        "YEREVAN", "VIENNA", "BAKU", "MINSK", "BRUSSELS",
                        "SARAJEVO", "SOFIA", "ZAGREB", "NICOSIA", "PRAGUE",
                        "COPENHAGEN", "TALLINN", "HELSINKI", "PARIS", "TBILISI",
                        "BERLIN", "ATHENS", "BUDAPEST", "REYKJAVIK", "DUBLIN",
                        "ROME", "ASTANA", "PRISTINA", "RIGA", "VADUZ", "VILNIUS",
                        "LUXEMBOURG", "SKOPJE", "VALLETTA", "CHISINAU", "MONACO",
                        "PODGORICA", "AMSTERDAM", "OSLO", "WARSAW", "LISBON",
                        "BUCHAREST", "MOSCOW", "BELGRADE", "BRATISLAVA",
                        "LJUBLJANA", "MADRID", "STOCKHOLM", "BERN", "ANKARA",
                        "KYIV", "LONDON"));
        return capitalsList;
    }

    public static String getRandomCapital(List<String> capitalsList) {
        String randomCapital = capitalsList.get(new Random().nextInt(capitalsList.size()));
        return randomCapital;

    }

}
