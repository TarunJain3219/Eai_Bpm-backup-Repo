import java.io.*;
import java.util.Scanner;
public class MinimumDenomination {
	
	static int MinRequired(int[] notes,int m,int n){
//		int size=notes.length;
		//int x1=0,x2=0,x3=0,x4=0,x5=0,x6=0;
		int sum=0;
		if(n==0){
			return sum;
		}
		for(int i=0;i<m;i++){
			if(notes[i]<=n){
				int count=0;
				count=n/notes[i];
				sum+=count;
				n=n-(count*notes[i]);
				if(n>0){
				MinRequired(notes,m,n);
				}else{
					break;
				}
			}
		}
		return sum;
		/*if(n==0){
			return 0;
		}else{
		while(n>0){
			if(n>=2000){
				x1=n/2000;
				n=n-(x1*2000);
				}else if(n>=500){
					x2=n/500;
					n=n-(x2*500);
						}else if(n>=200){
							x3=n/200;
							n=n-(x3*200);
							}else if(n>=100){
									x4=n/100;
									n=n-(x4*100);
								}else if(n>=50){
										x5=n/50;
										n=n-(x5*50);
										}else if(n>=10){
											x6=n/10;
											n=n-(x6*10);
										}
		}
		sum=x1+x2+x3+x4+x5+x6;
		return sum;
		}*/
	}
	
	public static void main(String args []){
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int notes[] =  {2000, 500, 100, 50, 10};
	     int m = notes.length;
		int required=MinRequired(notes,m,n);
		System.out.println(required);
	}
}
