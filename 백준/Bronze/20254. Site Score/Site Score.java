import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int ur = Integer.parseInt(st.nextToken());
		int tr = Integer.parseInt(st.nextToken());
		int uo = Integer.parseInt(st.nextToken());
		int to = Integer.parseInt(st.nextToken());
		
		System.out.println((56 * ur) + (24 * tr) + (14 * uo) + (6 * to));
	}

}