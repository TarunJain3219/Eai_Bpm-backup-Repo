package CountingPairs;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	 /*
     * Complete the function below.
     */
    static int countPairs(int[] numbers, int k) {
    	int n = numbers.length;
    	int count=0;
        for (int i=1; i<n; ++i)
        {
            int key = numbers[i];
            int j = i-1;
 
            while (j>=0 && numbers[j] > key)
            {
                numbers[j+1] = numbers[j];
                j = j-1;
            }
            numbers[j+1] = key;
        }  
        int[] temp = new int[n];
        
       
        int j = 0;
        for (int i=0; i<n-1; i++)
        {
            if (numbers[i] != numbers[i+1])
                temp[j++] = numbers[i];
        }
       
        temp[j++] = numbers[n-1];   
         
       
        
        for(int h=0;h<temp.length;h++){
        	System.out.println(temp[h]);
        }
        
        
        for(int i=0;i<temp.length;i++){
            for(int x=i+1;x<temp.length;x++){
               if(temp[i]+k==temp[x]){
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
        int numbers_size = 0;
        numbers_size = Integer.parseInt(in.nextLine().trim());

        int[] numbers = new int[numbers_size];
        for(int i = 0; i < numbers_size; i++) {
            int numbers_item;
            numbers_item = Integer.parseInt(in.nextLine().trim());
            numbers[i] = numbers_item;
        }

        int k;
        k = Integer.parseInt(in.nextLine().trim());

        res = countPairs(numbers, k);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
