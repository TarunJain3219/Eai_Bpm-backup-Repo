package com.example.multithreading;

import java.util.Scanner;

public class Atm {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 for Savings account ");
		System.out.println("press 2 for Current account ");
		int choice=sc.nextInt();
		Thread sa=new Thread(new SA());
		switch(choice){
		case 1: 
		}
	}
	public class SA implements Runnable{
			
	}
	

}
