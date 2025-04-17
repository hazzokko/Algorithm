import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();

		TestCase: for (int tc = 0; tc < N; tc++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			String word1 = st.nextToken();
			String word2 = st.nextToken();

			int[] arr = new int[26];
			for (int j = 0; j < word1.length(); j++) {
				arr[word1.charAt(j) - 'a']++;
			}

			for (int j = 0; j < word2.length(); j++) {
				arr[word2.charAt(j) - 'a']--;
			}

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] != 0) {
					System.out.println("Impossible");
					continue TestCase;
				}
			}
			System.out.println("Possible");
		}
	}
}