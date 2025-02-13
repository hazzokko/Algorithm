import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int avg = sc.nextInt();
        int num2 = (avg * 2) - num1;
        
        System.out.print(num2);
    }
}