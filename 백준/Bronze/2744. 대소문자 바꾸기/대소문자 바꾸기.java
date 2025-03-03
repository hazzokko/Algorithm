import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' <= 42) {
                answer += Character.toLowerCase(s.charAt(i));
            } else {
               answer += Character.toUpperCase(s.charAt(i));
            }
        }
        System.out.print(answer);
    }
}