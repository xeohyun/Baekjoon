package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q16953 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long A = Long.parseLong(input[0]);
        long B = Long.parseLong(input[1]);
        int count = 1;
        while(A < B){
            if(B % 2 == 0){
                B /= 2;
            } else if(B % 10 == 1){
                B /= 10;
            } else {
                break;
            }
            count++;
        }

        if(A == B){
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
