package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro2839 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugar = Integer.parseInt(br.readLine());

        int smallCnt = 0;

        while (true) {

            if (sugar % 5 == 0) {
                System.out.println(sugar / 5 + smallCnt);
                break;
            } else if (sugar < 0) {
                System.out.println(-1);
                break;
            }

            sugar = sugar - 3;
            smallCnt++;

        }

    }

}
