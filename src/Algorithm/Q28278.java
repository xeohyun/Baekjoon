package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q28278 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            String[] cmd = br.readLine().split(" ");
            switch(cmd[0]){
                case "1":
                    stack.push(Integer.parseInt(cmd[1]));
                    break;
                case "2":
                    if(stack.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                case "3":
                    sb.append(stack.size()).append("\n");
                    break;
                case "4":
                    sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "5":
                    if(stack.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
            }
        }
        System.out.print(sb.toString());
    }
}
