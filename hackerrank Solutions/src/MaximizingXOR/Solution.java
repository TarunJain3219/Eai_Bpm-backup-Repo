package MaximizingXOR;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	/*
     * Complete the function below.
     */
    static int maximum_XOR(int a, int b) {
        ArrayList<Integer> count=new ArrayList<Integer>();
        for(int i=a;i<b;i++){
            for(int j=a;j<b;j++){
                count.add(i^j);
            }
        }
        int max=0;
        for(int i=0; i<count.size(); i++){
            if(count.get(i) > max){
                max = count.get(i);
            }
        }
        return max;
        /*int[] arr= new int[count.size()];
        for(int j=0;j<count.size();j++){
            arr[j]=count.get(j).intValue();
        }
        int n=arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        for(int i=0;i<arr.length;i++){
        System.out.println("largest"+" "+arr[i]);}
        return arr[n-1];*/
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
        int a;
        a = Integer.parseInt(in.nextLine().trim());

        int b;
        b = Integer.parseInt(in.nextLine().trim());

        res = maximum_XOR(a, b);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
