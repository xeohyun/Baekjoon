package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Q3052 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            hs.add(Integer.parseInt(br.readLine()) % 42);
        }
        br.close();
        System.out.print(hs.size());
    }
}
