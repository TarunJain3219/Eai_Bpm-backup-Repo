package MinimumUniqueArraySum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	 /*
     * Complete the function below.
     */
    static int getMinimumUniqueSum(int[] a) {

        
                    int n = a.length;
        	int count=0;
            for (int i=1; i<n; ++i)
            {
                int key = a[i];
                int j = i-1;
     
                while (j>=0 && a[j] > key)
                {
                    a[j+1] = a[j];
                    j = j-1;
                }
                a[j+1] = key;
            } 
           int k=0;
            for(int i=0;i<a.length;i++){
            	k=a[i];
            	for(int j=0;j<a.length;j++){
                    
                	if(a[i]==a[j] && i!=j){
                        k++;
                       // System.out.println("next"+a[i]+' '+i+' '+j+' '+k);
                    }
                    
                }
            	a[i]=k;
            }
            /*for(int i=0;i<a.length;i++){
            	System.out.println(a[i]);
            }*/
            int sum=0;
            for(int i=0;i<a.length;i++)
            {
                sum+=a[i];
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

        int res;
        int arr_size = 0;
        arr_size = Integer.parseInt(in.nextLine().trim());

        int[] arr = new int[arr_size];
        for(int i = 0; i < arr_size; i++) {
            int arr_item;
            arr_item = Integer.parseInt(in.nextLine().trim());
            arr[i] = arr_item;
        }

        res = getMinimumUniqueSum(arr);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
