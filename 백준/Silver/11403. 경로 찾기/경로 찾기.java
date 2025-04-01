import java.util.Scanner;

public class Main {
	static int[][] graph;
	static int[][] path;
	static boolean[] visit;
	static int N;

	public static void dfs(int x, int y) {
		visit[y] = true;
		path[x][y] = 1;

		for(int i=0; i<N; i++) {
			if(graph[y][i] == 1 && visit[i] == false) {
				dfs(x, i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		graph = new int[N][N];
		path = new int[N][N];
		visit = new boolean[N];
        
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				graph[i][j] = scan.nextInt();
			}
		}

		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				visit[j] = false;
			}

			for(int j=0; j<N; j++) {
				if(graph[i][j] == 1 && visit[j] == false) {
					dfs(i, j);
				}
			}
		}

		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(path[i][j] + " ");
			}
			System.out.println();
		}
	}
}