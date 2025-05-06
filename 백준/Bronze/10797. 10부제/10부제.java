import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for (int i = 0; i < 5; i++) {
            int car = sc.nextInt();

            if (car == num) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}