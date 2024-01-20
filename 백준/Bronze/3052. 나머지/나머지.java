import java.util.Arrays;

interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) arr[i] = v.nextInt() % 42;
        System.out.println(Arrays.stream(arr).distinct().count());
    }
}