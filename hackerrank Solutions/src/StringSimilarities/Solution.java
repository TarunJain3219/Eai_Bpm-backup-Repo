package StringSimilarities;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	/*
     * Complete the function below.
     */
    static int[] stringSimilarity(String[] inputs) {
                
                int[] sum= new int[inputs.length];
                for(int x=0;x<inputs.length;x++){      
                	String[] substrings=new String[inputs[x].length()];	
                	for(int i=0;i<inputs[x].length();i++){
                				substrings[i]=inputs[x].substring(i);
                					
                				}
                		
                
                			/*for(int i=0;i<substrings.length;i++){
                						System.out.println(substrings[i]);
                					}*/
                			int s=0;
                				//System.out.println(substrings.length);
                					for(int i=0;i<substrings.length;i++){
                							int count=0;
                								String str1=inputs[x];
                								String str2=substrings[i];
                								
                									for(int j=0;j<str2.length();j++){
                										if(str1.charAt(0)!=str2.charAt(0)){
                											count=0;
                											break;
                										}else if(str1.charAt(j)==str2.charAt(j)){
                											count++;
                										}else{
                											break;
                										}
                        
                									}
                								
            
                								s+=count;
                								//System.out.println(s+" "+i);
                					}
                					sum[x]=s;
                }
                
                return sum; 
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
        int inputs_size = 0;
        inputs_size = Integer.parseInt(in.nextLine().trim());

        String[] inputs = new String[inputs_size];
        for(int i = 0; i < inputs_size; i++) {
            String inputs_item;
            try {
                inputs_item = in.nextLine();
            } catch (Exception e) {
                inputs_item = null;
            }
            inputs[i] = inputs_item;
        }

        res = stringSimilarity(inputs);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
}
