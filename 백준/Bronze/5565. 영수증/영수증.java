import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int price = sum;
        for (int i = 0; i < 9; i++) {
            price -= sc.nextInt();
        }
        System.out.println(price);
    }
}