import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M >= 45) {
            M = M - 45;
        } else {
            M = 60 - (45 - M);
            if (H > 0) {
                H = H - 1;
            } else {
                H = 23;
            }

        }
        System.out.println(H + " " + M);
    }
}