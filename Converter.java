public class Converter{

    public static String convertToDash(String randomCapital){
        String dashed;
        dashed = new String(new char[randomCapital.length()]).replace("\0", "_");
        return dashed;
    }

    public static String convertToLetter(String capital, Integer indexNumber, String letter){
        char c = letter.charAt(0);
        StringBuilder converted = new StringBuilder(capital);
        converted.setCharAt(indexNumber, c);
        return converted.toString();
    }

    public static void main(String[] args) {

        }


}
