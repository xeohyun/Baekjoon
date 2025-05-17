package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2577 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long val = 1L;
        for (int i = 0; i < 3; i++) {
            val *= Long.parseLong(br.readLine());
        }

        int[] arr = new int[10];
        do {
            arr[(int)(val % 10)]++;
            val /= 10;
        } while (val != 0);

        for (int count : arr) {
            System.out.println(count);
        }
    }
}
