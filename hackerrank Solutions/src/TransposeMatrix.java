import java.io.*;
import java.util.Scanner;
public class TransposeMatrix {
	public static void main(String args []){
		Scanner in = new Scanner(System.in);
		System.out.print("enter the size of square matrix: ");
		int size=in.nextInt();
		int row=size;
		int col=size;
		int[][] data = new int[row][col];
		for(row=0;row<size;row++){
			for(col=0;col<size;col++){
				System.out.println("enter the elements of square matrix: ");
				data[row][col]=in.nextInt();
			}
		}
		int[][] transpose = new int[row][col];
		int j=0,i=0,k=0;
		for(;k<size*size;){
			
			transpose[j][i]=data[i][j];
			i++;
			k++;
			if(i==size-1){
				j+=1;
				i=0;
			}
		}
		for(row=0;row<size;row++){
			for(col=0;col<size;col++){
				
				System.out.print(transpose[row][col]+" ");
				
			}
			System.out.println(" ");
		}
	}

}
