import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            String sum = String.valueOf(b + c);
            bw.write(sum);
            bw.newLine();
        }
        bw.flush();
    }
}