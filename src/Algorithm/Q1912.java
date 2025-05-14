package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1912 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] input = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        int max = arr[0];
        int sum = arr[0];
        for(int i=1; i<N; i++){
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
