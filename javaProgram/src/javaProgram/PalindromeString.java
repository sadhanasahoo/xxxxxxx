package javaProgram;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ;
		String rev = "";
		System.out.println("Enter the string :-");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		for(int i =(str.length()-1); i>=0 ; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse string is : " + rev );
		if(str.equals(rev) )
		{
			System.out.println(str + " is a Palindrome String");
		}
		else
		{
			System.out.println(str + " is not a Palindrome String");
		}

	}

}
