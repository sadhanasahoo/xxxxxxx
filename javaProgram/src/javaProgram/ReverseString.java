package javaProgram;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args)
	{
		String input ;
		System.out.println("Enter the string :-");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		String rev = "";
		
		for(int i= (input.length()-1); i>=0; i--)
		{
			rev = rev + input.charAt(i);
		}
		System.out.println("Reverse of string is  " + rev);
	}

}
