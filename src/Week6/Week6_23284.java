package Week6;

import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week6_23284 {
    public static void main(String[] args) throws IOException{
        Stack<Integer> st = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int tmp = 1;
        boolean rep = false;

        while(true){
            for(; tmp<=N; tmp++){
                st.push(tmp);

            }
        }
    }
}
