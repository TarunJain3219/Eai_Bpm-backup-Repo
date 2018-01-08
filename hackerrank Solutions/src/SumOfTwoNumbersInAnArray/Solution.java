package SumOfTwoNumbersInAnArray;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	/*
     * Complete the function below.
     */
    static int numberOfPairs(int[] a, long k) {
    	/*int n = a.length;
    	
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
        
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int pre=0;
        for(int i=0;i<a.length;i++){
        	if(i==0){
        		arr.add(a[i]);
        		pre=a[i];
        	}else{
        		if(a[i]==pre){
        			continue;
        		}else{
        			arr.add(a[i]);
        			pre=a[i];
        		}
        	}
        }
        int find;
        int[] finalArray=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
        	finalArray[i]=arr.get(i);
        }
        int Count=0,result=0,low,high;
        for(int i=0;i<finalArray.length;i++){
        	find=(int)(k - finalArray[i]  );
        	if(i==finalArray.length-1){
        	 continue;
        	}else{
        		//result= BinarySearch(finalArray, finalArray[i+1], finalArray[a.length-1], find);
        		low=i+1;
        		high=finalArray.length-1;
        		while(low<=high){
            		int mid=(low+high)/2;
            		if(finalArray[mid]==find){
            			result= mid;
            			break;
            		}else if(finalArray[mid]>find){
            			high=mid-1;
            		}else{
            			low=mid+1;
            		}
            		
            	}
        	}
        	if(result!=0){
        		Count+=1;
        	}
        }
        return Count;*/
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
        int[] temp = new int[n];
        
       
        int j = 0;
        for (int i=0; i<n-1; i++)
        {
            if (a[i] != a[i+1])
                temp[j++] = a[i];
        }
       
        temp[j++] = a[n-1];   
         
       for(int i=0;i<temp.length;i++){
            for(int x=i+1;x<temp.length;x++){
               if(temp[i]+temp[x]==k){
                   count++;
               }
            }
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

        int res;
        int a_size = 0;
        a_size = Integer.parseInt(in.nextLine().trim());

        int[] a = new int[a_size];
        for(int i = 0; i < a_size; i++) {
            int a_item;
            a_item = Integer.parseInt(in.nextLine().trim());
            a[i] = a_item;
        }

        long k;
        k = Long.parseLong(in.nextLine().trim());

        res = numberOfPairs(a, k);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
