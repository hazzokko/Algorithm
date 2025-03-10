import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int avg = sc.nextInt();
        sc.close();
        
        int total = num * (avg - 1) + 1;
        
        System.out.print(total);
    }
}