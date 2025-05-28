import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("");
        int a = 0;
        int b = 0;
        for (String s : arr) {
            if (s.equals("A")) {
                a++;
            } else {
                b++;
            }
        }
        System.out.println(a + " : " + b);
    }
}