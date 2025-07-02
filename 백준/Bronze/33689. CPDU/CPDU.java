import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int count = 0;
        for (int i = 0; i < num; i++) {
            String str = sc.nextLine();
            if (str.startsWith("C")) {
                count++;
            }
        }
        sc.close();
        System.out.print(count);
    }
}