package com.kodnest.patterns.practice;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i= 0; i<= 4 ; i++)
        {
            for (int j=0; j<=i; j++) 
            { 
            System.out.print("*"+ " "); 
            } 
            System.out.println(""); 
            } 
            for (int i=4; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
	}

}
