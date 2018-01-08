package CutTheStrings;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	 /*
     * Complete the function below.
     */
	static int[] cutSticks(int[] lengths) {
		   ArrayList<Integer> temp=new ArrayList<Integer>();
		    	
		        	int k=0,checkCount=0;
		        	int min=minimum(lengths);
		        	int count=0;
		        	while(true){
		                count=0;
		                checkCount=0;
		        	for(int i=0;i<lengths.length;i++){
		        		if(lengths[i]>=1){
		        			count++;
		        			lengths[i]=lengths[i]-min;
		        		}else{
		        			checkCount++;
		        		}
		        		
		        		
		        		
		        	}
		        	if(checkCount==lengths.length){
		    			break;
		    		}
		        	temp.add(count);
		        	}
		        	
		        	int[] finalarray=new int[temp.size()];
		        	for(int i=0;i<temp.size();i++){
		        		finalarray[i]=temp.get(i);
		        	}
		        return finalarray;

		    }
		    static int minimum(int [] lengths){
		    	int min=lengths[0];
		    	for(int i=1;i<lengths.length;i++){
		    		if(lengths[i]>0 && lengths[i]<min ){
		    			min=lengths[i];
		    		}
		    	}
		    	return min;
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
        int lengths_size = 0;
        lengths_size = Integer.parseInt(in.nextLine().trim());

        int[] lengths = new int[lengths_size];
        for(int i = 0; i < lengths_size; i++) {
            int lengths_item;
            lengths_item = Integer.parseInt(in.nextLine().trim());
            lengths[i] = lengths_item;
        }

        res = cutSticks(lengths);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
}
