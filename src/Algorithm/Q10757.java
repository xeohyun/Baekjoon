package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10757 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        String A = st.nextToken();
        String B = st.nextToken();

        int lenA = A.length();
        int lenB = B.length();
        int maxLen = Math.max(lenA, lenB);
        int carry = 0;

        for (int i = 0; i < maxLen; i++) {
            int digitA = (lenA - 1 - i >= 0) ? A.charAt(lenA - 1 - i) - '0' : 0;
            int digitB = (lenB - 1 - i >= 0) ? B.charAt(lenB - 1 - i) - '0' : 0;

            int sum = digitA + digitB + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            sb.append(carry);
        }

        System.out.println(sb.reverse().toString());

    }
}
