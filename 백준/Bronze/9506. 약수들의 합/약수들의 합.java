import java.util.Arrays;
import java.util.stream.Collectors;

interface Main {
    static void main (String[] s) {
        var v = new java.util.Scanner(System.in);
        while (v.hasNext()) {
            int num = v.nextInt();
            int sum = 0;
            String str = "";
            if (num == -1) break;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                    str += i + " ";
                }
            }
            if (num == sum) {
                System.out.print(num + " = ");
                String strArr = Arrays.stream(str.split(" ")).collect(Collectors.joining(" + "));
                System.out.println(strArr);
            } else {
                System.out.println(num + " is NOT perfect.");
            }
        }
    }
}