import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt(); // 기준
      int F = sc.nextInt(); // 나누는 수
      String str = String.valueOf(N);
      String sliceStr = str.substring(0, str.length() - 2);

      for (int i = 0; i <= 99; i++) {
         int num;
         if (i < 10) {
            num = Integer.valueOf(sliceStr + '0' + i);
         } else {
            num = Integer.valueOf(sliceStr + i);
         }
         if (num % F == 0) {
            if (i < 10) {
               System.out.println("0" + i);
            } else {
               System.out.println(i);
            }
            break;
         }
      }
   }
}