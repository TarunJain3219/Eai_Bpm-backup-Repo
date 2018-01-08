
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	/*
     * Complete the function below.
     */
    static int countDuplicates(int[] numbers) {
            HashMap<Integer,Integer> count = new HashMap<>();
            for(int i=0;i<numbers.length;i++){
            	if(!count.containsKey(numbers[i])){
            		count.put(numbers[i],1);
            	}else{
            		count.put(numbers[i],count.get(numbers[i])+1);
            	}
            }
            int Sum=0;
            for(Map.Entry<Integer, Integer> entry:count.entrySet()){
            	int frequency= entry.getValue();
            	if(frequency>1){
            		Sum+=1;
            	}
            }
            return Sum;
            
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

        res = countDuplicates(numbers);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}

