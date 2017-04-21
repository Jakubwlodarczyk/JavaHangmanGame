
public class Converter {

    /**
    * Convert given string to dashed string, without changing spaces
    * @param String: name of randomly choosen Capital
    */
    public static String convertToDash(String randomCapital){
        String dashed;
        dashed = new String(new char[randomCapital.length()]).replace("\0", "_");
        int[] listOfIndexes = Checker.listOfIndexes(" ", randomCapital);
        for (Integer index : listOfIndexes){
            dashed = convertToLetter(dashed, index, " ");
        }
        return dashed;
    }

    /**
    * Convert dash in string for given letter, on specified index
    * @param String: name of randomly choosen Capital
    * @param Intereg: index number
    * @param String: letter to set in string on a given index
    */
    public static String convertToLetter(String capital, Integer indexNumber, String letter){
        StringBuilder converted = new StringBuilder(capital);
        char c = letter.charAt(0);
        converted.setCharAt(indexNumber, c);
        return converted.toString();
    }
}
