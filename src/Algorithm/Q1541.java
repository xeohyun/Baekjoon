package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1541 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer subtraction = new StringTokenizer(br.readLine(), "-");
        int result = 0;
        boolean first = true;

        while(subtraction.hasMoreTokens()){
            StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "+");
            int sum = 0;
            while(addition.hasMoreTokens()){
                sum += Integer.parseInt(addition.nextToken());
            }
            if(first){
                result = sum;
                first = false;
            } else {
                result -= sum;
            }
        }
        System.out.println(result);
    }
}
