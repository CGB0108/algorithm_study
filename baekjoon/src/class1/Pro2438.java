package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Pro2438 {


    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        for(int i =1; i <= num; i++){
            for(int j = 1; j<= i; j++ ){
                System.out.print("*");
            }
            System.out.print("\n");
        }  
        
    }
}
