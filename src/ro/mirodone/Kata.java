package ro.mirodone;

import java.util.Arrays;

public class Kata {

    public  double findUniq(double arr[]) {
        // Do the magic

        Arrays.sort(arr);
        if (arr[0] == arr[1]) {
            return arr[arr.length - 1];
        }
        return arr[0];
    }
}
