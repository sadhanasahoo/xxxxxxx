package javaProgram;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		int n ;
		int rev = 0 ;
		System.out.println("Enter a number--");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int temp = n ;
		while(n!= 0)
		{
		rev = (rev * 10) + n%10;
		n= n/10;
		}
		if(temp == rev)
		{
			System.out.println( temp +" is a Palindrome Number");
		}
		else{
			System.out.println( temp +" is not a Palindrome Number");
		}
	}

}
