import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        int min = sum / 60;
        int sec = sum % 60;

        System.out.println(min);
        System.out.println(sec);
    }
}