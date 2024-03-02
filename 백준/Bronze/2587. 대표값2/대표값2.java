import java.util.Arrays;

interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = v.nextInt();
        int avg = (int) Arrays.stream(arr).average().getAsDouble();
        Arrays.sort(arr);
        System.out.println(avg);
        System.out.println(arr[2]);
    }
}