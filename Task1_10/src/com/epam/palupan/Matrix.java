package com.epam.palupan;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		System.out.println("Input even integer positive number:");
		int number = inputInt();
		while (number <= 0 || number % 2 != 0) {
			System.out.println("Reenter even integer positive number:");
			number = inputInt();
		}

		int[][] matrix = new int[number][number];

		matrix = fillEvenRows(matrix);

		matrix = fillOddRows(matrix);
		show(matrix);
	}

	private static int[][] fillEvenRows(int[][] matr) {
		for (int i = 0; i < matr.length; i = i + 2) {
			for (int j = 0; j < matr[i].length; j++) {
				matr[i][j] = j + 1;
			}
		}
		return matr;
	}

	private static int[][] fillOddRows(int[][] matr) {
		for (int i = 1; i < matr.length; i = i + 2) {
			for (int j = 0; j < matr[i].length; j++) {
				matr[i][j] = matr.length - j;
			}
		}
		return matr;
	}

	private static void show(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
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
