import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            if (a < 40) {
                sum += 40;
            } else {
                sum += a;
            }
        }
        System.out.print(sum / 5);
    }
}