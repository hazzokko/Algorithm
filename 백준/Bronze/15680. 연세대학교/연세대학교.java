import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        if (N == 0) {
            System.out.println("YONSEI");
        } else if (N == 1) {
            System.out.println("Leading the Way to the Future");
        }
    }
}