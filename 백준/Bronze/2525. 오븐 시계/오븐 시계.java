import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if ((B + C) < 60) {
            System.out.println(A + " " + (B + C));
        } else {
            int plusHour = A + ((B + C) / 60);
            int min = (B + C) % 60;
            if (plusHour >= 24) {
                System.out.println(plusHour - 24 + " " + min);
            } else {
                System.out.println(plusHour + " " + min);
            }
        }
    }
}