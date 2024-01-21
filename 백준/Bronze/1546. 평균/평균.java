import java.util.Arrays;

interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        int total = v.nextInt();
        int[] arr = new int[total];
        double sum = 0;
        for (int i = 0; i < total; i++) {
            arr[i] = v.nextInt();
            sum += arr[i];
        }
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println((sum / max * 100)/total);
    }
}