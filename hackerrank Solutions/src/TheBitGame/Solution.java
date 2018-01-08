package TheBitGame;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	 /*
     * Complete the function below.
     */
    static int maxXor(int left, int right, int k) {
        int find=0;
        ArrayList<Integer> count=new ArrayList<Integer>();    
        for(int i=left;i<right;i++){
                for(int j=i+1;j<=right;j++){
                    count.add(i^j);
                }
            }
       /* for(int i=0;i<count.size();i++){
        	System.out.println("count"+" "+i+" "+count.get(i));
        }*/
        int max=0;
        for(int i=0;i<count.size();i++){
            if(k>=count.get(i)){
            	if(count.get(i)>=max){
            		max=count.get(i);
            	}
            }
        }
        return max;
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
        int left;
        left = Integer.parseInt(in.nextLine().trim());

        int right;
        right = Integer.parseInt(in.nextLine().trim());

        int k;
        k = Integer.parseInt(in.nextLine().trim());

        res = maxXor(left, right, k);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
