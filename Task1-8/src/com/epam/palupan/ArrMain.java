package com.epam.palupan;

import java.util.Scanner;

public class ArrMain {

	public static void main(String[] args) {
		System.out.println("The array mas(size) will be generated automatically with values in (0;range]");
		System.out.println("Input size of the array:");
		int size = inputInt();
		Array mas = new Array(size);
		System.out.println("Input high range of random output for the array :");
		int range = inputInt();
		mas.create(range);
		mas.show();
		while(true) {
		System.out.println("Input integer k(0-for exit):");
		int multiplier = inputInt();
		if(multiplier==0){
			System.out.println(" Bye !!!");
			break;
		}
		mas.sumElements(multiplier);
		}

	}

	private static int inputInt() {
		int x = 0;
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("You inputed not an integer number!!");
			System.out.println("Input integer:");
			
			sc = new Scanner(System.in);
		}
		x = sc.nextInt();
		
		return x;

	}

}
