package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pro1157 {


    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int [] count = new int[26];

        //65 ~ 90
        for(int i = 0; i < str.length(); i++ ){
            int num = str.charAt(i) - 'A';
            count[num] += 1;
        }
       
        int maxCnt = 0;
        char answer = '?';
        for(int i = 0; i < 26; i++){
            if(maxCnt < count[i]){
                maxCnt = count[i];
                answer = (char)(i+65);
            }else if(maxCnt == count[i]){
                answer = '?';
            }
        }
        
        System.out.println(answer);
    }
}
