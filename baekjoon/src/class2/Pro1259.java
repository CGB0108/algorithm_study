package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1259 {


    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();

            if(str.equals("0")) break;
            boolean result = true;
            for(int i=0; i<str.length()/2; i++){
                if(str.charAt(i) != (str.charAt(str.length()-i-1))){
                    result = false;
                }
            }
            
            if(result){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            
        }
      
    }
}
