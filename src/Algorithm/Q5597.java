package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q5597 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[31];
        for(int i=0; i<28; i++){
            int num = Integer.parseInt(br.readLine());
            arr[num] = true;
        }
        for(int i=1; i<arr.length; i++){
            if(!arr[i]){
                System.out.println(i);
            }
        }
    }
}
