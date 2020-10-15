package sample;
import java.util.Arrays;
import java.util.HashSet;

public class OperandsCounter {
    String str;

    public String[] globalVarCounter(String str){
        this.str = str;
        String currVar = "";
        String[] arrGlobalVar = {};
        int k = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '$' && str.charAt(i + 1) != ' ') {
                while (str.charAt(i) != ' ' && str.charAt(i) != '=') {
                    currVar += str.charAt(i);
                    i++;
                }
                arrGlobalVar = Arrays.copyOf(arrGlobalVar, arrGlobalVar.length + 1);
                arrGlobalVar[k] = currVar;
                currVar = "";
                k++;
            }
        }
        removeDuplicates(arrGlobalVar);
        return arrGlobalVar;
    }

    public String[] exempVarCounter(String str){
        this.str = str;
        String currVar = "";
        String[] arrExempVar = {};
        int k = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '@' && str.charAt(i + 1) != ' ' && str.charAt(i + 1) != '@' && str.charAt(i-1) != '@'){
                while (str.charAt(i) != ' ' && str.charAt(i) != '=' && str.charAt(i) != '.'){
                    currVar += str.charAt(i);
                    i++;
                }
                arrExempVar = Arrays.copyOf(arrExempVar, arrExempVar.length + 1);
                arrExempVar[k] = currVar;
                currVar = "";
                k++;
            }
        }
        removeDuplicates(arrExempVar);
        return arrExempVar;
    }

    public String[] classVarCounter(String str){
        this.str = str;
        String currVar = "";
        String[] arrClassVar = {};
        int k = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '@' && str.charAt(i + 1) != ' ' && str.charAt(i - 1) == '@'){
                while (str.charAt(i) != ' ' && str.charAt(i) != '=' && str.charAt(i) != '.'){
                    currVar += str.charAt(i);
                    i++;
                }
                arrClassVar = Arrays.copyOf(arrClassVar, arrClassVar.length + 1);
                arrClassVar[k] = currVar;
                currVar = "";
                k++;
            }
        }
        removeDuplicates(arrClassVar);
        return arrClassVar;
    }

    private static void removeDuplicates(String[] array) {
        HashSet<String> hash = new HashSet<String>();
        for (int i = 0 ; i < array.length; i++) {
            array[i] = hash.add(array[i]) ? array[i] : "";
        }
    }
}
