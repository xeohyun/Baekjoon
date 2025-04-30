package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10773 {
    public static void main(String[] args) throws Exception{
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        for(int i=0; i<K; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0) stack.pop();
            else stack.push(num);
        }

        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}
