import java.util.Arrays;
import java.util.Scanner;

interface Main {
    static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        System.out.println(Arrays.stream(arr).filter(x -> x == a).count());
    }
}