package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1436 {


    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int input = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 1;

        while(count != input){
            num += 1;

            if(String.valueOf(num).contains("666")){
                count += 1;
            }
       }

       System.out.println(num);
      
    }
}
