package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int max = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > max){
                max = arr[i];
            }
        }

        double sum = 0;
        for(int i=0; i<N; i++){
            sum += (double)arr[i]/max*100;
        }

        double result = sum/N;
        System.out.println(result);
    }
}
