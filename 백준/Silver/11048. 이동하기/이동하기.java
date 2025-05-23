import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        int[][] map = new int[N+1][M+1];
        int[][] dp = new int[N+1][M+1];
        
        for(int i=1; i<=N; i++){
            inputs = br.readLine().split(" ");
            for(int j=1; j<=M; j++){
                map[i][j] = Integer.parseInt(inputs[j-1]);
            }
        }

        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                dp[i][j] = Math.max(map[i][j]+dp[i-1][j], map[i][j]+dp[i][j-1]);
            }
        }

        System.out.println(dp[N][M]);
    }
}