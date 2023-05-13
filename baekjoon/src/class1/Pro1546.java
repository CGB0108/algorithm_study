package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Pro1546 {


    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        double[] score = new double[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        

        
        int max = 0;
        for(int i = 0; i< num; i++){
            score[i] = Integer.parseInt(st.nextToken()); 
            if(max < score[i]){
                max = (int)score[i];
            }
        }

        for(int i = 0; i < num; i++){
            if(score[i] <= max){
                score[i] = score[i]/max * 100; 
            }
        }
        
        double sum = 0;
        for(int i=0; i < num; i++){
            sum += score[i];
        }
        
        double answer = sum / num;
        System.out.println(answer);
        
    }
}
