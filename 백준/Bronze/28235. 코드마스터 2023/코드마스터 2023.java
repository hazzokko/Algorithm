import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        switch(str) {
            case "SONGDO":
                System.out.print("HIGHSCHOOL");
                break;
            case "CODE":
                System.out.print("MASTER");
                break;
            case "2023":
                System.out.print("0611");
                break;
            case "ALGORITHM":
                System.out.print("CONTEST");
                break;
        }
    }
}