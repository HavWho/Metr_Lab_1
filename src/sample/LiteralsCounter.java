package sample;
import java.util.Arrays;
import java.util.HashSet;

public class LiteralsCounter {
    String str;

    public LiteralsCounter(String str){
        this.str = str;
    }

    public String[] literalVarCounter(){
        String currVar = "";
        String[] arrLiteralVar = {};
        int k = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isDigit(str.charAt(i))){
                while (str.charAt(i) != '$' && str.charAt(i) != '=' && str.charAt(i) != '@' && Character.isDigit(str.charAt(i))){
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
