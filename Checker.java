
public class Checker{

    public static String convertToDash(String randomCapital){
        String dashed;
        dashed = new String(new char[randomCapital.length()]).replace("\0", "_ ");
        return dashed;
    }

    public static void main(String[] args) {

    }
}
