package com.kodnest.patterns.practice;

public class Practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<= 5 ; i++) 
		{ 
			for (int j = 5; j > i ; j--) 
			{
            System.out.print(" ");
            }
        System.out.print("*");
        for (int k = 1; k < 2*(i -1) ;k++)
        { 
        System.out.print(" "); } if( i==1)
        { 
        System.out.println(""); 
        }
        else { System.out.println("*");
        } 
        } 
        for (int i=5-1; i>= 1 ; i--)
        {
        for (int j = 5; j > i ; j--) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int k = 1; k < 2*(i -1) ;k++) {
            System.out.print(" ");
        }
        if( i==1)
            System.out.println("");
        else
            System.out.println("*");
    }
	}

}
