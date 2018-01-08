package SimpleQuery;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	 /*
     * Complete the function below.
     */
    static int[] counts(int[] nums, int[] maxes) {
           int[] c=new int[maxes.length];
        
        /*for(int i=0;i<maxes.length;i++){
            int find=0;
            for(int j=0;j<nums.length;j++){
                if(maxes[i]>nums[j]){
                    find++;
                }
            }
            c[i]=find;
        }*/
           int n = nums.length;
       	int count=0;
           for (int i=1; i<n; ++i)
           {
               int key = nums[i];
               int j = i-1;
    
               while (j>=0 && nums[j] > key)
               {
                   nums[j+1] = nums[j];
                   j = j-1;
               }
               nums[j+1] = key;
           }  
           for(int i=0;i<maxes.length;i++){
        	   c[i]=LessThanEqualBinarySearch( maxes[i], nums, nums.length );
           }
        return c;   
    }
    static int LessThanEqualBinarySearch( int key, int data[], int len )
    {
        int low = 0;
        int high = len-1;
        

        while( low <= high)
        {
        	int mid=(low+high)/2;

             if (data[mid] < key) 
            	 low  = mid + 1;
             else if (data[mid] > key) 
            	 		high  = mid - 1;
             			else  
             				return mid    ;
        }

        if( high < 0 )
            return 0;  
        else
        if( low > (len-1))
            return len; 
        else
            return (low < high) ? low  : high + 1;
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
        int nums_size = 0;
        nums_size = Integer.parseInt(in.nextLine().trim());

        int[] nums = new int[nums_size];
        for(int i = 0; i < nums_size; i++) {
            int nums_item;
            nums_item = Integer.parseInt(in.nextLine().trim());
            nums[i] = nums_item;
        }

        int maxes_size = 0;
        maxes_size = Integer.parseInt(in.nextLine().trim());

        int[] maxes = new int[maxes_size];
        for(int i = 0; i < maxes_size; i++) {
            int maxes_item;
            maxes_item = Integer.parseInt(in.nextLine().trim());
            maxes[i] = maxes_item;
        }

        res = counts(nums, maxes);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
}