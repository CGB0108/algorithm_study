package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Pro11651 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[][] array = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array, (arg1, arg2) -> {
            if (arg1[1] == arg2[1]) {
                return arg1[0] - arg2[0];
            } else {
                return arg1[1] - arg2[1];
            }
        });

        for (int i = 0; i < N; i++) {
            sb.append(array[i][0] + " " + array[i][1]).append('\n');
        }

        System.out.println(sb);

    }
}
