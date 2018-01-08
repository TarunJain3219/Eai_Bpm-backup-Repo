package BucketSort;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
	public static void BucketSort(char[] sequence ){
		int i,j;
		String result=" ";
		char[] bucket=new char[26];
		for(i=0;i<sequence.length;i++){
			char c=sequence[i];
			bucket[c-'a']=c;
		}
		for(i=0;i<26;i++){
			if(Character.isLetter(bucket[i])){
				result+=bucket[i];
			}
		}
		System.out.println(result.replaceAll(" ", ""));
		
	}
	
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		//System.out.println(('d'-'a')+1);
		String name=in.next();
		char[] sequence=new char[name.length()];
		for(int i=0;i<name.length();i++){
			sequence[i]=name.charAt(i);
		}
		BucketSort(sequence);
		
	}
}
