package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int result = 0;
        for (int i = 0; i < num; i++) {
            boolean isPrime = true;

            int n = Integer.parseInt(st.nextToken());

            if (n == 1) {
                continue;
            }
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result++;
            }
        }
        System.out.println(result);

    }

}
