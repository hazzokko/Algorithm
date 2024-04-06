import java.util.*;

interface Main {
    static void main(String[] str) {
        var v = new java.util.Scanner(System.in);
        int min = v.nextInt();
        int max = v.nextInt();
        int sum = 0;
        List<Integer> arr = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                arr.add(i);
                sum += i;
            }
        }

        if (arr.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(arr.get(0));
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}