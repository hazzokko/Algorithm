import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();	//시험장의 개수
        int[] arr = new int[n];	//응시자의 수가 담긴 배열
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int b = sc.nextInt();	//총감독관 감시 가능 인원
        int c = sc.nextInt();	//부감독관 감시 가능 인원

        long count = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i]<=b){	//1-1) 
            	count++;
                continue;
            }else{
            	count++;
            	arr[i] -= b;
            	
                count += arr[i] / c;
                if (arr[i] % c != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}