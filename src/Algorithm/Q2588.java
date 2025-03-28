package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();  // 공백 없이 받기

        int b1 = B.charAt(2) - '0';  // 1의 자리
        int b2 = B.charAt(1) - '0';  // 10의 자리
        int b3 = B.charAt(0) - '0';  // 100의 자리

        System.out.println(A * b1);
        System.out.println(A * b2);
        System.out.println(A * b3);
        System.out.println(A * Integer.parseInt(B));
    }
}
