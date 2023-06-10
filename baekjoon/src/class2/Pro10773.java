package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Pro10773 {


    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0; i< n; i++){

            int num = Integer.parseInt(br.readLine());

            if(num != 0){
                stack.push(num);
            }else{
                stack.pop();
            }

        }

        int sum = 0;

        for(int one : stack){
            sum += one;
        }

        
        System.out.println(sum);
        
       
    }
}
