import java.util.Arrays;

interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in);
        int cases = v.nextInt();
        int quarter = 25, dime = 10, nickel = 5, penny = 1;
        int[] arr = new int[4];
        for (int i = 0; i < cases; i++) {
            int amount = v.nextInt();
            arr[0] = amount / quarter;
            amount %= quarter;
            arr[1] = amount / dime;
            amount %= dime;
            arr[2] = amount / nickel;
            amount %= nickel;
            arr[3] = amount / penny;
            Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        }
    }
}