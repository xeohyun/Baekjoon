package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int result = 0;

        String[] tar = new String[N];
        for (int i = 0; i < N; i++) {
            tar[i] = br.readLine();
        }

        String[] arr = new String[M];
        for (int i = 0; i < M; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(tar);
        for (int i = 0; i < M; i++) {
            if (Arrays.binarySearch(tar, arr[i]) >= 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}
