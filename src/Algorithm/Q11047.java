package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11047 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int[] coins = new int[N];
        for(int i=0; i<N; i++){
            coins[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for(int i=N-1; i>=0; i--){
            if(K == 0) break;
            if(coins[i] <= K){
                count += K / coins[i];
                K %= coins[i];
            }
        }
        System.out.println(count);
    }
}
