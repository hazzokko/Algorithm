import java.util.Arrays;

interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        int x = v.nextInt(), y = v.nextInt(), w = v.nextInt(), h = v.nextInt();
        int[] arr = {x, y, w-x, h-y};
        System.out.println(Arrays.stream(arr).min().getAsInt());
    }
}