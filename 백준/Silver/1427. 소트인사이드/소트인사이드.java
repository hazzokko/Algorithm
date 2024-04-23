import java.util.*;

interface Main {
    static void main(String[] str) {
        var v = new java.util.Scanner(System.in);
        String num = String.valueOf(v.nextInt());
        String[] arr = num.split("");

        Arrays.sort(arr, Collections.reverseOrder());
        
        for (String s : arr) {
            System.out.print(s);
        }
    }
}