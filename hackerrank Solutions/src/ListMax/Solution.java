package ListMax;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
     Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=0;
        }
        /*for(int j=0;j<n;j++){
                System.out.println("pre"+ arr[j]);
            }*/
        for(int i=0;i<m;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int k=in.nextInt();
           
            //System.out.println(k);
            
            for(int j=a-1;j<b;j++){
                arr[j]+=k;
            }
            /*for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }*/
        }
            
            int len = n;
       	int count=0;
           for (int x=1; x<len; ++x)
           {
               int key = arr[x];
               int j = x-1;
    
               while (j>=0 && arr[j] > key)
               {
                   arr[j+1] = arr[j];
                   j = j-1;
               }
               arr[j+1] = key;
           }  
          System.out.println( arr[len-1]);  
        
    }
}