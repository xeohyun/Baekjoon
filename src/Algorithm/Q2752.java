package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2752 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] arr = new int[3];
        for(int i=0; i<3; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<3; i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}
