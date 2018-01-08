package CupcakeFeast;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	

    /*
     * Complete the function below.
     */
    static void maximumCupcakes(String[] trips) {
            String[] Case=new String[trips.length];
            int[] result=new int[trips.length];
        int cupcakes=0,wrapper=0;
            for(int i=0;i<trips.length;i++)
            {
                Case=trips[i].split(" ");
                int n=Integer.valueOf(Case[0]);
                int c=Integer.valueOf(Case[1]);
                int m=Integer.valueOf(Case[2]);
                cupcakes=(n/c);
                wrapper=cupcakes;
                int temp=0;
                while(wrapper>=m){
                    cupcakes+=wrapper/m;
                    temp=wrapper/m;
                    wrapper-=(temp)*m;
                    wrapper+=(temp);
                }
                result[i]=cupcakes;
                
            }
         for(int i=0;i<result.length;i++){
             System.out.println(result[i]);
         }
    }
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int trips_size = 0;
        trips_size = Integer.parseInt(in.nextLine().trim());

        String[] trips = new String[trips_size];
        for(int i = 0; i < trips_size; i++) {
            String trips_item;
            try {
                trips_item = in.nextLine();
            } catch (Exception e) {
                trips_item = null;
            }
            trips[i] = trips_item;
        }

        maximumCupcakes(trips);
        
    }
}
