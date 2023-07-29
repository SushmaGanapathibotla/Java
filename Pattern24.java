package com.kodnest.patterns.practice;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	      System.out.print("Enter a word: ");
	      String word = scan.nextLine();
	      int size = word.length();
	      for (int i=0; i < (2*size-1); i++) 
	      {
	        if(i<size)
	        {
	          for (int j=0; j<=i; j++) 
	          {
	            System.out.print(word.charAt(j));
	          }
	        } 
	        else
	        {
	          for (int j=(2*size-i-2); j>=0; j--) 
	          {
	            System.out.print(word.charAt(j));
	          }
	        }
	        System.out.println();
	      }
	}

}
