interface Main {
    static void main(String[] s) {
        var v = new java.util.Scanner(System.in).nextLine();
        String[] str = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (int i = 0; i < str.length; i++) {
            if (v.contains(str[i])) {
                v = v.replace(str[i], "!");
            }
        }
        System.out.println(v.length());
    }
}