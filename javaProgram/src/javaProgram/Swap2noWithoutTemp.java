package javaProgram;

import java.util.Scanner;

public class Swap2noWithoutTemp {
	public static void main(String[] args) {
		int  x , y ;
		System.out.println("Enter the 2 no -");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("Before swapping x value = " + x + " and y value = " + y );
		System.out.println("*@*@*@*@*@-------@*@*@*@*@*");
		x = x+y;
		y = x-y;
		x = x-y;		
		System.out.println("After swapping x value = " + x + " and y value = " + y );
		
	}

}
