package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro2577 {


    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int[] num = new int [10];
        
        int abc = a*b*c;

        while(abc > 0){
            num[abc%10] += 1;
            abc /= 10;
        }

        for(int i = 0; i < 10; i++){
            System.out.println(num[i]);
        }
       
    }
}
