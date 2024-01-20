import java.util.Arrays;
import java.util.stream.IntStream;

interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) arr[i] = v.nextInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
        System.out.println(IntStream.range(0, arr.length).filter(x -> arr[x] == max).findFirst().getAsInt() + 1);
    }
}