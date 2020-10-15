package sample;
import java.util.Arrays;
import java.util.HashSet;

public class LiteralsCounter {
    String str;

    public String[] literalVarCounter(String str){
        this.str = str;
        String currVar = "";
        String[] arrLiteralVar = {};
        int k = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isDigit(str.charAt(i))){
                while ((str.equals("int") || str.equals("float") && str.equals("string") || str.equals("char") || str.equals("bool") || str.equals("byte")) && Character.isDigit(str.charAt(i))){
                    currVar += str.charAt(i);
                    i++;
                }
                arrLiteralVar = Arrays.copyOf(arrLiteralVar, arrLiteralVar.length + 1);
                arrLiteralVar[k] = currVar;
                currVar = "";
                k++;
            }
        }
        removeDuplicates(arrLiteralVar);
        return arrLiteralVar;
    }

    private static void removeDuplicates(String[] array) {
        HashSet<String> hash = new HashSet<String>();
        for (int i = 0 ; i < array.length; i++) {
            array[i] = hash.add(array[i]) ? array[i] : "";
        }
    }
}
