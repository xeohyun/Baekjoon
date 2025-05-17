package Algorithm;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q14916 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int coinCount = 0;
        while(true)
        {
            if(n % 5 == 0)
            {
                coinCount += n / 5;
                System.out.println(coinCount);
                break;
            }
            else
            {
                n -= 2;
                ++coinCount;
            }
            if(n < 0)
            {
                System.out.println(-1);
                break;
            }
        }
    }
}
