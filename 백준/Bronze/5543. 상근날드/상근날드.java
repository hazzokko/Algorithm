import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int upper = sc.nextInt();
		int middle = sc.nextInt();
		int lower = sc.nextInt();
		int coke = sc.nextInt();
		int cider = sc.nextInt();
		sc.close();
		
		int sum = Math.min(upper, Math.min(middle, lower)) + Math.min(coke, cider) - 50;
		
		System.out.println(sum);
	}
}