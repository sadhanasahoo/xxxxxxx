package javaProgram;

import java.util.Scanner;

public class Swap2noWithTemp {
	public static void main(String[] args) {
		int x, y, temp;
		System.out.println("Enter 2 no :-");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("Before swapping x value = " + x + " and y value = " + y );
		System.out.println("***************");
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("After swapping x value = " + x + " and y value = " + y );
		
		
	}

}
