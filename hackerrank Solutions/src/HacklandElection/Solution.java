package HacklandElection;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	 /*
     * Complete the function below.
     */
    static String electionWinner(String[] votes) {
        String temp;
        for (int i = 0; i < votes.length; i++) 
        {
            for (int j = i + 1; j < votes.length; j++) 
            {
                if (votes[i].compareTo(votes[j])>0) 
                {
                    temp = votes[i];
                    votes[i] = votes[j];
                    votes[j] = temp;
                }
            }
        }
       /* for(int i=0;i<votes.length;i++){
            System.out.println(votes[i]);
            
        }*/
        String[] Name=new String[votes.length];
        int[] count=new int[votes.length];
        for(int i=0;i<votes.length;i++){
            count[i]=0;
            
        }
        int k=0;
        for(int i=0;i<votes.length-1;i++){
        	//count[k]+=1;
            if(votes[i].compareTo(votes[i+1])==0){
                Name[k]=votes[i];
                count[k]+=1;
            }else{
            	count[k]+=1;
                k++;
            }
            
        }
        /*for(int i=0;i<k;i++){
            System.out.println(Name[i]);
            System.out.println(count[i]);
        }*/
        
        int n = Name.length;
    	
        for (int i=1; i<n; ++i)
        {
            int key = count[i];
            String key1=Name[i];
            int j = i-1;
 
            while (j>=0 && count[j] > key)
            {
            	count[j+1] = count[j];
            	Name[j+1]=Name[j];
                j = j-1;
            }
            count[j+1] = key;
            Name[j+1]=key1;
        } 
        
        
            
            
          return Name[votes.length-1];         
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

        String res;
        int votes_size = 0;
        votes_size = Integer.parseInt(in.nextLine().trim());

        String[] votes = new String[votes_size];
        for(int i = 0; i < votes_size; i++) {
            String votes_item;
            try {
                votes_item = in.nextLine();
            } catch (Exception e) {
                votes_item = null;
            }
            votes[i] = votes_item;
        }

        res = electionWinner(votes);
        bw.write(res);
        bw.newLine();

        bw.close();
    }
}
