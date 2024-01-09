import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int hour = (A + ((B + C) / 60)) % 24;
        int min = (B + C) % 60;

        System.out.println(hour + " " + min);
    }
}