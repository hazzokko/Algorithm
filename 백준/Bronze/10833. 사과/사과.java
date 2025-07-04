import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < num; i++) {
            int student = sc.nextInt();
            int apple = sc.nextInt();
            count += apple % student;
        }
        System.out.print(count);
    }
}