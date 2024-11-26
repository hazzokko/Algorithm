import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nmrtrA = sc.nextInt();
		int dnmntrA = sc.nextInt();
		int nmrtrB = sc.nextInt();
		int dnmntrB = sc.nextInt();
		
		int nmrtr = (nmrtrA * dnmntrB) + (nmrtrB * dnmntrA);
		int dnmntr = dnmntrA * dnmntrB;
		
		for (int i = 2; i < dnmntr; i++) {
			while (nmrtr % i == 0 && dnmntr % i == 0) {
				nmrtr /= i;
				dnmntr /= i;
			}
		}
		
		System.out.println(nmrtr + " " + dnmntr);
	}
}