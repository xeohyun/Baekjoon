package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10807 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        int X = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i<N; i++){
            if(Integer.parseInt(arr[i]) == X){
                count++;
            }
        }
        System.out.println(count);
    }
}
