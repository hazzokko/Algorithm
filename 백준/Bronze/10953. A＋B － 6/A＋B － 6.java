import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ",");
            int tmp = 0;
            while (st.hasMoreTokens()) {
                tmp += Integer.parseInt(st.nextToken());
            }
            System.out.println(tmp);
        }
    }
}
