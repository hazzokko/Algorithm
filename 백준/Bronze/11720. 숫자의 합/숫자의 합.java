import java.util.Arrays;

interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        int i = v.nextInt();
        String str = v.next();
        String[] arr = Arrays.stream(str.split("")).toArray(String[]::new);
        int sum = 0;
        for (String str1 : arr) {
            sum += str1.charAt(0) - '0';
        }
        System.out.println(sum);
    }
}