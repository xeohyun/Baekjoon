package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11723 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        boolean[] set = new boolean[21];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            String[] cmd = br.readLine().split(" ");
            String operation = cmd[0];
            int x = 0;
            if(cmd.length > 1) {
                x = Integer.parseInt(cmd[1]);
            }
            switch (operation) {
                case "add":
                    set[x] = true;
                    break;
                case "remove":
                    set[x] = false;
                    break;
                case "check":
                    sb.append(set[x] ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    set[x] = !set[x];
                    break;
                case "all":
                    for(int j=1; j<=20; j++){
                        set[j] = true;
                    }
                    break;
                case "empty":
                    for(int j=1; j<=20; j++){
                        set[j] = false;
                    }
                    break;
            }
        }
        System.out.print(sb.toString());
    }
}
