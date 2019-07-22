package javaProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		boolean isprime = true ;
		System.out.println("Enter a number--");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 2 ; i<= (n/2) ; i++)
		{
			if(n%i == 0)
			{
				isprime = false;
				break;
			}
		}
		
		if(isprime)
		{
			System.out.println(n +" is a prime no.");
		}
		else
		{
			System.out.println(n +" is not a prime no.");
		}
		

	}

}
