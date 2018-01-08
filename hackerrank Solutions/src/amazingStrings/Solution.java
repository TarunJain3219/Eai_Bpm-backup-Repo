package amazingStrings;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	 /*
     * Complete the function below.
     */
    static int[] minimalOperations(String[] words) {
           /* int n=words.length,tag=0;
        int[] count=new int[n];
        for(int i=0;i<n;i++){
            String word=words[i];
            int c=0,j=0;
            for(;j<word.length();){
                if(j+1!=word.length()-1){
                    if(word.charAt(j)==word.charAt(j+1)){
                        
                        j+=2;
                        c+=1;
                    }else{
                        j+=1;
                    }
                    
                }
            }
            count[i]=c;
            
        }
        return count;*/
    	int n;
    	n=words.length;
    	int[] count=new int[words.length];
    	
    	for(int i=0;i<n;i++){
    		String w=words[i];
    		int c=0,j=0;
    		for(;j<w.length();){
    			if(j+1==w.length()-1){
    				break;
    			}else{
    				if(w.charAt(j)==w.charAt(j+1)){
    					c+=1;
    					j+=2;
    				}
    				
    			}
    			j++;
    		}
    		count[i]=c;
    	}
    	return count;
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
        int words_size = 0;
        words_size = Integer.parseInt(in.nextLine().trim());

        String[] words = new String[words_size];
        for(int i = 0; i < words_size; i++) {
            String words_item;
            try {
                words_item = in.nextLine();
            } catch (Exception e) {
                words_item = null;
            }
            words[i] = words_item;
        }

        res = minimalOperations(words);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
}
