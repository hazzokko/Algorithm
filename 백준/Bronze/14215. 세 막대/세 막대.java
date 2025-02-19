import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		Integer[] arr = { a, b, c };
		Arrays.sort(arr, Collections.reverseOrder());
		
		if (arr[0] >= arr[1] + arr[2]) {
			arr[0] = arr[1] + arr[2] - 1;
		}
		
		System.out.println(arr[0] + arr[1] + arr[2]);
	}
}