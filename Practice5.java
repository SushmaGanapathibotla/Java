package com.kodnest.patterns.practice;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++)
        {
        	for(int j=i;j<5;j++)
        	{
        		System.out.print(" ");
        	}
        	for(int k=1;k<=(2*i-1);k++)
        	{
        		if(k==1||i==5||k==(2*i-1))
        		{
        			System.out.print("*");
        		}
        		else
        		{
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
        }
	}

}
