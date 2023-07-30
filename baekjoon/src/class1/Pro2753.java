package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro2753 {


    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        int result = 0;

        if(num%400 == 0){
            result = 1;
        }else if(num%4 == 0 && num%100 != 0){
            result  = 1;
        }
      
        System.out.println(result);
       
    }
}
