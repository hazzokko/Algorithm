import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("LoveisKoreaUniversity");
            
            if (num != 1) {
                System.out.print(" ");
            }
        }
    }
}