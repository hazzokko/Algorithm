import java.util.*;

interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        int total = v.nextInt();
        int winner = v.nextInt();
        Integer[] arr = new Integer[total];
        for (int i = 0; i < total; i++) arr[i] = v.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[winner - 1]);
    }
}