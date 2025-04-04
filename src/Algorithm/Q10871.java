package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10871 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        String[] arr = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            if(Integer.parseInt(arr[i]) < X){
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
