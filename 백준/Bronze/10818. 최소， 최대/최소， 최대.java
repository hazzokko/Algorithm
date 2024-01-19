import java.util.Arrays;

interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        int[] arr = new int[v.nextInt()];
        for (int i = 0; i < arr.length; i++) arr[i] = v.nextInt();
        System.out.print(Arrays.stream(arr).min().getAsInt() + " ");
        System.out.print(Arrays.stream(arr).max().getAsInt());
    }
}