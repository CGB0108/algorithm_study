package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pro2609 {


    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int fn = Integer.parseInt(st.nextToken());
        int sn = Integer.parseInt(st.nextToken());
         

        int bsn = gcd(Math.max(fn, sn), Math.min(fn, sn));

        int ssn = fn*sn / bsn;

        System.out.println(bsn);
        System.out.println(ssn);

    }

    public static int gcd(int bn, int sn){

        if(sn == 0) return bn;

        return gcd(sn, bn%sn );
    }
}
