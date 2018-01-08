import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class CountingBits {

	/*
     * Complete the function below.
     */
    static int[] getOneBits(int n) {
            String str= Integer.toBinaryString(n);
            int k=0;
            int Sum=0;
            
            ArrayList<Integer> position= new ArrayList<Integer>();
            
            for(int i =0;i<str.length();i++){
            	if(str.charAt(i)=='1'){
            		Sum+=1;
            		position.add(i+1);
            		
            	}
            }
            int[] arr=new int[position.size()+1];
            arr[k]=Sum;
            k+=1;
            for(int j=0;j<position.size();j++){
            	arr[k]=position.get(j);
            	k+=1;
            }
            return arr;
            
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

        int[] res;
        int n;
        n = Integer.parseInt(in.nextLine().trim());

        res = getOneBits(n);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
}
