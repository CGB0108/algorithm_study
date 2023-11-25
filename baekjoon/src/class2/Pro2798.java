package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro2798 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int Max = Integer.parseInt(st.nextToken());

        int[] array = new int[num];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        int result = 0;
        for (int i = 0; i < num - 2; i++) {
            for (int j = i + 1; j < num - 1; j++) {
                for (int k = j + 1; k < num; k++) {
                    int temp = array[i] + array[j] + array[k];
                    if (Max == temp) {
                        result = temp;
                    }
                    if (result < temp && temp < Max) {
                        result = temp;
                    }
                }
            }
        }

        System.out.println(result);
    }

}
