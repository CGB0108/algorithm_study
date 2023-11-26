package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro2869 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int tree = Integer.parseInt(st.nextToken());

        int result = (tree - up) / (up - down);

        if ((tree - up) % (up - down) == 0) {
            System.out.println(result + 1);
        } else {
            System.out.println(result + 2);
        }

    }

}
