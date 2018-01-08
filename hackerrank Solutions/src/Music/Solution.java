package Music;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	/*
     * Complete the function below.
     */
    static int numOfPlaylist(int N, int K, int L) {
    	long Sum=1;
    	int mod=1000000007;
    	System.out.println(mod);
    	if(N==K){
    		return 0;
    		
    	}else{
    		
    		for(int i=0;i<K;i++){
    			Sum=(Sum*(N-i))%mod;
    			
    		}
    		for(int i=K;i<L-K;i++){
    			Sum=(Sum*(N-K))%mod;
    			
    		}
    	}
            return (int)Sum; 
    }
   
    public static void main(String[] args) throws IOException {
    	
    	
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int res;
        int N;
        N = Integer.parseInt(in.nextLine().trim());

        int K;
        K = Integer.parseInt(in.nextLine().trim());

        int L;
        L = Integer.parseInt(in.nextLine().trim());

        res = numOfPlaylist(N, K, L);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    	
    	
    }
}
