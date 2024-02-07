public class Main {

    public static void main(String[] args) {

        var v = new java.util.Scanner(System.in);

        int N = v.nextInt();
        int arr[] = new int[N];
        int M = v.nextInt();
        int temp;

        for(int i = 0; i < arr.length; i++) arr[i] = i + 1;
                                     
        for(int j = 0; j < M; j++) {
            int I = v.nextInt();
            int J = v.nextInt();

            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
        }
        
        for(int k = 0; k < arr.length; k++) System.out.print(arr[k] + " ");
    }
}