package com.kodnest.patterns.practice;

public class Practice17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) 
        {           
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }             
            for (int j = i; j <= 5; j++) 
            { 
                System.out.print(j); 
            }              
            System.out.println(); 
        }        
        for (int i = 4; i >= 1; i--) 
        {
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }            
            for (int j = i; j <= 5; j++)
            {
                System.out.print(j);
            }             
            System.out.println();

        } 
	}

}
