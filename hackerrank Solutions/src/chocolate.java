import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class chocolate {
	/*
     * Complete the function below.
     */
    static void calculate(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
                for(int j=1;j<=arr[i];j++){
                	if(j%2!=0){
                		count+=j;
                	}
                }
                System.out.println(count);
                count=0;
                
            }
        
    }
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int arr_size = 0;
        arr_size = Integer.parseInt(in.nextLine().trim());

        int[] arr = new int[arr_size];
        for(int i = 0; i < arr_size; i++) {
            int arr_item;
            arr_item = Integer.parseInt(in.nextLine().trim());
            arr[i] = arr_item;
        }

        calculate(arr);
        
    }
}