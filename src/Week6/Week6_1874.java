package Week6;

import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week6_1874{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int tmp = 1;
        boolean err = false;

        for(int i=0; i<N; i++){
            int target = Integer.parseInt(br.readLine());

            for(; tmp<=target; tmp++){
                st.push(tmp);
                sb.append("+\n");
            }
            if(st.peek()==target){
                st.pop();
                sb.append("-\n");
            }else{
                err = true;
            }
        }
        if(err){
            System.out.println("NO");
        }else{
            System.out.println(sb);
        }

    }
}
