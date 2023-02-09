package com.test;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num, s = 0,c;
		
		System.out.println("Enter any Number: ");
		
		Scanner sc = new Scanner(System.in);
		
		 num=sc.nextInt();
		 
		 c=num;
		 
		 while(num>0) {
			 
			int r= num % 10;
			
			s=(s*10)+r;
			
			num = num/10;
		 }
		 if (c==s) {
			 
			 System.out.println("Palindrome Number");
			 
		 }else {
			 
			 System.out.println("Not Palindrome Number");
		 }
		

	}

}
