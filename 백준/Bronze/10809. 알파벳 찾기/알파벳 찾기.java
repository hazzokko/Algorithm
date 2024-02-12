interface Main {
    static void main (String[] s) {
        var v = new java.util.Scanner(System.in);
        String str = "abcdefghijklmnopqrstuvwxyz";
        String word = v.next();
        String[] split = str.split("");
        for (int i = 0; i < split.length; i++) {
            if (word.contains(split[i])) {
                System.out.print(word.indexOf(split[i]));
            } else {
                System.out.print(-1);
            }
            System.out.print(" ");
        }
    }
}