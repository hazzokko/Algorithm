import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 7 == 2) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}