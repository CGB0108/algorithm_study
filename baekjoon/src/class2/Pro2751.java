package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro2751 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] array = new boolean[2000001];

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            array[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j]) {
                sb.append(j - 1000000).append('\n');
            }
        }
        System.out.println(sb);

    }
}
