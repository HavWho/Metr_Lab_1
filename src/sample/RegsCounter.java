package sample;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegsCounter {
    String[] regsArray;
    int[] arrayCounter = {};
    String str;

    public void RegsCount(String[] regsArray, String str) {
        this.regsArray = regsArray;
        this.str = str;
    }

    public void counter(){
        for (int i = 0; i < regsArray.length; i++) {
            arrayCounter = Arrays.copyOf(arrayCounter, arrayCounter.length + 1);
            Pattern pattern = Pattern.compile(regsArray[i]);
            Matcher matcher =  pattern.matcher(str);
            arrayCounter[i] = 0;
            while (matcher.find()){
                arrayCounter[i]++;
            }
        }
    }
}

