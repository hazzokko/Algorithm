import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String output = "";
        if (str.equals("NLCS")) {
            output = "North London Collegiate School";
        } else if (str.equals("BHA")) {
            output = "Branksome Hall Asia";
        } else if (str.equals("KIS")) {
            output = "Korea International School";
        } else if (str.equals("SJA")) {
            output = "St. Johnsbury Academy";
        }
        System.out.print(output);
    }
}