import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      
      for (int i = 0; i < num; i++) {
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = a > b ? a : b;
         int tmpA = a, tmpB = b, tmpAB = 1;
         
         for (int j = 2; j <= c; j++) {
            while (tmpA % j == 0 && tmpB % j == 0) {
               tmpA = tmpA / j;
               tmpB = tmpB / j;
               tmpAB *= j;
            }
         }
         System.out.println(tmpAB * tmpA * tmpB);
      }
   }
}