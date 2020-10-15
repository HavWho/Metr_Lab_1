package sample;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegsCounter {
    int[] arrayCounter = {};
    int numberOfRegex;
    String[] regsArray;
    String str;
    String[] outRegs = new String[30];

    public int counter(String[] regsArray, String str){
        this.regsArray = regsArray;
        this.str = str;

        numberOfRegex = 0;

        int positionCounter = 0;
        int regsCounter = 0;
        for (int i = 0; i < regsArray.length; i++) {
            arrayCounter = Arrays.copyOf(arrayCounter, arrayCounter.length + 1);
            Pattern pattern = Pattern.compile(regsArray[i]);
            Matcher matcher = pattern.matcher(str);
            arrayCounter[i] = 0;

            while (matcher.find()){
                arrayCounter[i]++;
                for (int j = 0; j < outRegs.length; j++) {
                    if (regsArray[i] == outRegs[j]) {
                        regsCounter++;
                    }
                }
                if (regsCounter == 0) {
                    outRegs[positionCounter] = regsArray[i];
                    System.out.println("Оператор " + outRegs[positionCounter]);
                    positionCounter++;
                }
                regsCounter = 0;
            }
        }
        System.out.println("\n");

        for (int i = 0; i < arrayCounter.length; i++) {
            numberOfRegex += arrayCounter[i];
        }
        return numberOfRegex;
    }
}

