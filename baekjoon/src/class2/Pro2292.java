package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro2292 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int i = 1;
        int house = 2;

        if (num == 1) {
            System.out.println(1);
        } else {
            while (num >= house) {
                house = house + (i * 6);
                i++;
            }

            System.out.println(i);
        }
    }

}
