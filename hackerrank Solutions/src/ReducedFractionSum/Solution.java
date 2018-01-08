package ReducedFractionSum;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
		/*
		}
     * Complete the function below.
     */
    static String[] reducedFractionSums(String[] expressions) {
        int num,num1,num2,dem,dem1,dem2;
        String[] output=new String[expressions.length];
        int n=expressions.length;
        for(int i=0;i<n;i++){
        	String[] numbers=expressions[i].split("[\\/+]");
        	
        	System.out.println(numbers.length);
            num1=Integer.parseInt(numbers[0]);
            dem1=Integer.parseInt(numbers[1]);
            num2=Integer.parseInt(numbers[2]);
            dem2=Integer.parseInt(numbers[3]);
            System.out.println("num1"+" "+num1+" "+"dem1"+" "+dem1+" "+"num2"+" "+num2+" "+"dem2"+" "+dem2+" ");
            num=num1*dem2+num2*dem1;
            dem=dem1*dem2;
            int gcd = gcd(num, dem);
            System.out.println("num"+" "+num+" "+"dem"+" "+dem+" "+"gcd"+" "+gcd);
            num /= gcd;
            dem /= gcd;
            int k=0;
            String ans="";
            ans+=Integer.toString(num);
            ans+="/";
            ans+=Integer.toString(dem);
            output[k]=ans;
            k+=1;
            /*numbers=null;
            System.out.println(numbers.length);*/
        }
        return output;
    }
    static int gcd(int a, int b)
    {
        if (b==0) return a;
        return gcd(b,a%b);
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

        String[] res;
        int expressions_size = 0;
        expressions_size = Integer.parseInt(in.nextLine().trim());

        String[] expressions = new String[expressions_size];
        for(int i = 0; i < expressions_size; i++) {
            String expressions_item;
            try {
                expressions_item = in.nextLine();
            } catch (Exception e) {
                expressions_item = null;
            }
            expressions[i] = expressions_item;
        }

        res = reducedFractionSums(expressions);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
}


