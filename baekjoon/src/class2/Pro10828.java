package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro10828 {
    static int[] stack;
    static int size = 0;
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());       
        stack = new int[num];
       
        for(int i=0; i<num; i++){
            String method = br.readLine();
            StringTokenizer st = new StringTokenizer(method);

            switch(st.nextToken()){
                case "push" : push(Integer.parseInt(st.nextToken())); break;
                case "pop" : System.out.println(pop()); break;
                case "size" : System.out.println(size()); break;
                case "empty" : System.out.println(empty()); break;
                case "top" :  System.out.println(top()); break;
            }
        }
    }
    static void push(int num){
        stack[size]=num;
        size += 1;
    }

    static int pop(){
        if(size == 0){
            return -1;
        }else{
            int res = stack[size - 1];
            stack[size -1] = 0;
            size -= 1;
            return res;
        }
        
    }
    
    static int size(){
        return size;
    }

    static int empty(){
        if(size == 0){
            return 1;
        }
        return 0;

    }

    static int top(){
        if(size == 0){
            return -1;
        }else{
            return stack[size -1];
        }
    }
    
}
