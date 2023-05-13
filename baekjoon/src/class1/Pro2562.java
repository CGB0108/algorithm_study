package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro2562 {


    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] num = new int [9];
        
        int max = 0;
        int maxNum = 0;
        
        for(int i = 0; i < 9; i++){
            num[i] = Integer.parseInt(br.readLine());
            if(max < num[i]){
                max = num[i];
                maxNum = i+1;
            }
        }

        System.out.println(max +"\n"+maxNum);
    }
}
