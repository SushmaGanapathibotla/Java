package com.kodnest.patterns.practice;

import java.util.Scanner;

public class Practice21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	      System.out.print("Enter a word: ");
	      String word = scan.nextLine();
	      int size = word.length();

	      for (int i=0; i<size; i++) {
	        for (int j=0; j<=size/2; j++) {
	          if(i == size/2 ){
	            System.out.print(word);
	            break;
	          } else {
	            if(j == size/2)
	              System.out.print(word.charAt(i));
	            else
	              System.out.print(" "); // one space
	          }
	        }
	        System.out.println(); // new line
	      }
	}

}
