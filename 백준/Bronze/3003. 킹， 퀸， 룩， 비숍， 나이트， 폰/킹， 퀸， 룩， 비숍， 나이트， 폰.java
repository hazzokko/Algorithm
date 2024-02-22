import java.util.Arrays;

interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        int[] arr = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < arr.length; i++) arr[i] -= v.nextInt();
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
    }
}