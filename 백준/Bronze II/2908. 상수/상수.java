import java.util.stream.Stream;

interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in).nextLine();
        String[] str = v.split(" ");
        String[] str1 = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            str1[i] = "";
            for (int j = str[0].length() - 1; j >= 0; j--) {
                str1[i] += str[i].charAt(j);
            }
        }
        int result = Stream.of(str1).mapToInt(Integer::parseInt).max().getAsInt();
        System.out.println(result);
    }
}