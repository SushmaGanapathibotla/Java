package com.kodnest.patterns.practice;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	      System.out.print("Enter a word: ");
	      String word = scan.nextLine();
	      int len = word.length();
	      for(int i=0; i<len-1; i++) 
	      {
	        for(int j=0; j<len-i-1; j++)
	        {
	          System.out.print(" ");
	        }
	        for(int j=0; j<=i; j++)
	        {
	          System.out.print(word.charAt(j)); 
	        }
	        System.out.println(); 
	      }
	      for(int i=0; i<len; i++)
	      {
	        for(int j=0; j<i; j++)
	        {
	          System.out.print(" ");
	        }
	        for(int j=i; j<len; j++) 
	        {
	          System.out.print(word.charAt(j)); 
	        }
	        System.out.println(); 
	      }
	}

}
