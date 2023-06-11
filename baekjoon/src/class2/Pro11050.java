package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro11050 {


    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        int result = run(a) / (run(b)*run(a-b)) ;


        System.out.println(result);
       
    }

    public static int run(int num){
        int result = 1;

        for(int i =1; i<= num; i++){
            result *= i;
        }

        return result;
    }
}
