package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q16435 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int L = Integer.parseInt(input[1]);
        String[] arr = br.readLine().split(" ");
        int[] fruits = new int[N];
        for(int i=0; i<N; i++){
            fruits[i] = Integer.parseInt(arr[i]);
        }
        int max = 0;
        Arrays.sort(fruits);
        for(int i=0; i<N; i++){
            if(L >= fruits[i]){
                L++;
            }
        }
        System.out.println(L);
    }
}
