package com.epam.palupan;

import java.util.Scanner;


public class PrintingTrueOrFalse {
	static int number;

	static int input() {
		int x = 0;
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("You input no" +
					"t an integer number");
			System.out.println("Input an integer number");
			
			sc = new Scanner(System.in);
		}
		x = sc.nextInt();

		return x;
	}

	public static void main(String[] args) {
		try {
			if (args.length >0) {
				number = Integer.parseInt(args[0]);
				if(number/10000!=0){
					System.out.println("Not a 4-difit number!!!!");
				}else{
				System.out.println(number);
				}
			} 
			else{
				System.out.println("Input 4 digit number!!!");
			}
		} catch (NumberFormatException e) {
			System.out.println("Input number in command line!!!");
		}
		
		System.out.println("Input integer four figures number:");
		
		
			int k=number=input();
			while(k/10000!=0){
				System.out.println("Input integer four figures number:");
				k=number=input();
			}
		int a, b, c, d;
		boolean isFulfiled = true;
		d = number % 10;
		number = number / 10;
		c = number % 10;
		number = number / 10;
		b = number % 10;
		a = number / 10;
		if ((a + b) ==( c + d)) {
			System.out.println("(a + b) ==( c + d) is "+ isFulfiled + " in number " + k);
		} else {
			isFulfiled = false;
			System.out.println("(a + b) ==( c + d) is "+ isFulfiled + " in number " + k);

		}

	}

}
