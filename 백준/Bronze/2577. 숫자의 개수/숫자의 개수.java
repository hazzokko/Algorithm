import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() * sc.nextInt() * sc.nextInt();
        int[] count = new int[10];
        while (a > 0) {
            count[a % 10]++;
            a /= 10;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }
}