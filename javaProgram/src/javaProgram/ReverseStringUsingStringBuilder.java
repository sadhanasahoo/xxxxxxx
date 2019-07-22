package javaProgram;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {
	public static void main(String[] args){
		String input= "" ;
		System.out.println("Enter the string value :--");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(input);
		System.out.println(sb.reverse());
		
		
	}

}
