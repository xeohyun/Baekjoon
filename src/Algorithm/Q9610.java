package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q9610 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int q1 = 0, q2 = 0, q3 = 0, q4 = 0, axis = 0;

        for(int i=0; i<N; i++){
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            if(x ==0 || y == 0){
                axis++;
            } else if(x > 0 && y > 0){
                q1++;
            } else if(x < 0 && y > 0){
                q2++;
            } else if(x < 0 && y < 0){
                q3++;
            } else {
                q4++;
            }
        }

        sb.append("Q1: ").append(q1).append("\n");
        sb.append("Q2: ").append(q2).append("\n");
        sb.append("Q3: ").append(q3).append("\n");
        sb.append("Q4: ").append(q4).append("\n");
        sb.append("AXIS: ").append(axis).append("\n");

        System.out.print(sb.toString());

    }
}
