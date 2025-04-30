package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1427 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[str.length()];
        for(int i=0; i<str.length(); i++){
            arr[i]= str.charAt(i) - '0';
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
    }
}
