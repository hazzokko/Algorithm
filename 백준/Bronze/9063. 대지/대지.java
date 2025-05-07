import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	
		int minX = 0, minY = 0, maxX = 0, maxY = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (i == 0) {
				minX = x;
				maxX = x;
				minY = y;
				maxY = y;
			}
			
			minX = Math.min(minX, x);
			minY = Math.min(minY, y);
			maxX = Math.max(maxX, x);
			maxY = Math.max(maxY, y);
		}
		
		sc.close();
		
		int area = (maxX - minX) * (maxY - minY);
		
		System.out.println(area);
	}
}