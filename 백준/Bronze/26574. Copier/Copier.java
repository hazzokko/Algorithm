import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            System.out.println(tmp + " " + tmp);
        }
    }
}