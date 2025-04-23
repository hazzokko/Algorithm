import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n % 2 == 0) {
            System.out.println("I LOVE CBNU");
        } else {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            n = n / 2 + 1;
            int first_count = n;
            int last_count = n;

            System.out.print("\n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < first_count; j++) {
                    System.out.print(j != first_count - 1 ? " " : "*");
                }

                for (int j = first_count; j < last_count; j++) {
                    System.out.print(j != last_count - 1 ? " " : "*");
                }

                System.out.print("\n");
                first_count -= 1;
                last_count += 1;
            }
        }
    }
}