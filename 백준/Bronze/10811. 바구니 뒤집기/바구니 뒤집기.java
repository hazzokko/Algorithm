import java.util.Arrays;
import java.util.stream.Collectors;

interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        int[] arr = new int[v.nextInt()];
        int count = v.nextInt();
        for (int i = 0; i < arr.length; i++) arr[i] = i + 1;
        for (int j = 0; j < count; j++) {
            int n = v.nextInt();
            int m = v.nextInt();
            for (int k = 0; k < (m - n + 1) / 2; k++) {
                int temp = arr[n - 1 + k];
                arr[n - 1 + k] = arr[m - 1 - k];
                arr[m - 1 - k] = temp;
            }
        }
        System.out.print(Arrays.stream(arr)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(" ")));
    }
}