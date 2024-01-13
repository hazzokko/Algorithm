import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a, b, c};

        if (a == b && b == c) {
            System.out.println(10000 + (a * 1000));
        } else if (a != b && b != c && a != c) {
            int max = Arrays.stream(arr).max().getAsInt();
            System.out.println(max * 100);
        } else if ((a == b && a != c) || (a == c && a != b)) {
            System.out.println(1000 + (a * 100));
        } else {
            System.out.println(1000 + (b * 100));
        }
    }
}