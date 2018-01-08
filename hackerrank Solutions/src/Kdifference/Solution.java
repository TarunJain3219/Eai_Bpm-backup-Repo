package Kdifference;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the function below.
     */
    static int kDifference(int[] a, int k) {
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
        for(int i=0;i<a.length;i++){
        		int find=a[i]+k;
        		if (binarySearch(a, i+1, a.length-1, find) != -1){
        			count+=1;	
        		}
        }
        return count;
    }
   static int binarySearch(int arr[], int low, int high, int x)
    {
        if (high >= low)
        {
            int mid = low + (high - low)/2;
            if (x == arr[mid])
                return mid;
            if (x > arr[mid])
                return binarySearch(arr, (mid + 1), high, x);
            else
                return binarySearch(arr, low, (mid -1), x);
        }
        return -1;
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
        int a_size = 0;
        a_size = Integer.parseInt(in.nextLine().trim());

        int[] a = new int[a_size];
        for(int i = 0; i < a_size; i++) {
            int a_item;
            a_item = Integer.parseInt(in.nextLine().trim());
            a[i] = a_item;
        }

        int k;
        k = Integer.parseInt(in.nextLine().trim());

        res = kDifference(a, k);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
