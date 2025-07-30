import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] arr = new char[n][2*n-1];
        StringBuilder sb = new StringBuilder();
        arr[0][n-1] = '*';
        
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < arr[i].length-1; j++) {
                if (arr[i][j] == '*') {
                    arr[i+1][j-1] = '*';
                    arr[i+1][j+1] = '*';
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == '*') {
                    sb.append("*");
                    count++;
                } else {
                    sb.append(" ");
                }
                if (count == i+1) break;
            }
            if (i == n-1) break;
            sb.append("\n");
        }
        System.out.print(sb);
    }
}