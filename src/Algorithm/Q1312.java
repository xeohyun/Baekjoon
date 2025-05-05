package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1312 {
    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int num = A / B;
        A = A % B;
        while (cnt < N) {
            A *= 10;
            num = A / B;
            A = A % B;
            cnt++;
            if (cnt == N) {
                sb.append(num);
                break;
            }
        }
        System.out.println(sb);

    }
}
