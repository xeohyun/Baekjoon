package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q14405 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(s.replaceAll("pi|ka|chu", "").length() == 0 ? "YES" : "NO");
    }
}
