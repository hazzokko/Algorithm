import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("-");
        for (String s : arr) {
            System.out.print(s.charAt(0));
        }
    }
}