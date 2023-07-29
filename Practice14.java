package com.kodnest.patterns.practice;

public class Practice14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++)
		{
            for (int j = 0; j <= 5 - i; j++) {
  
           
                System.out.print(" ");
            }
            int x = 1;
            for (int k = 1; k <= i; k++)
            {
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
	}

}
