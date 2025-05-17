import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = 0;
        int T = 0;
        for (int i = 0; i < 8; i++) {
            int tmp = sc.nextInt();
            if (i < 4) {
                S += tmp;
            } else {
                T += tmp;
            }
        }
        if (S == T) {
            System.out.println(S);
        } else {
            System.out.println(Math.max(S, T));
        }
    }
}