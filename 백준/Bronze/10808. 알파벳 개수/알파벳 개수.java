import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[26];
        
        for (int i = 0; i < str.length(); i++) {
            int tmp = str.charAt(i) - 97;
            arr[tmp]++;
        }
        
        for(int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}