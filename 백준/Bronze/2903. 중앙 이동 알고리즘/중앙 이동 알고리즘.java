import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 2;
		sc.close();
		
		for (int i = 0; i < N; i++) {
			num += num - 1;
		}
		
		System.out.println(num * num);
	}
}