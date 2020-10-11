package sample;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegsCounter {
    String[] regsArray;
    int[] arrayCounter = {};
    String str;
    int numberOfRegex;

    public int counter(String[] regsArray, String str){
        this.regsArray = regsArray;
        this.str = str;

        numberOfRegex = 0;

        for (int i = 0; i < regsArray.length; i++) {
            arrayCounter = Arrays.copyOf(arrayCounter, arrayCounter.length + 1);
            Pattern pattern = Pattern.compile(regsArray[i]);
            Matcher matcher = pattern.matcher(str);
            arrayCounter[i] = 0;

            while (matcher.find()){
                arrayCounter[i]++;
                System.out.println(regsArray[i]);
            }
        }

        for (int i = 0; i < arrayCounter.length; i++) {
            numberOfRegex += arrayCounter[i];
        }
        return numberOfRegex;
    }
}

