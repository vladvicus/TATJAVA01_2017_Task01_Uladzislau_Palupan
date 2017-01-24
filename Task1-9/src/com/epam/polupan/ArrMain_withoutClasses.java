package com.epam.polupan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

public class ArrMain_withoutClasses {

	public static void main(String[] args) {
		System.out.println("The arrays will be generated automatically with values in (0;range]");

		System.out.println("Input size of the array1:");
		int size = inputInt();
		int[] mas0 = new int[size];
		System.out.println("Input high range of random output for the 1st array :");
		int range = inputInt();
		mas0 = randGeneratorOfArray(mas0, range);

		System.out.println("Input size of the array2:");
		int size1 = inputInt();
		int[] mas1 = new int[size1];
		System.out.println("Input high range of random output for the 2nd array :");
		int range1 = inputInt();
		mas1 = randGeneratorOfArray(mas1, range1);

		System.out.println("First generated array: ");
		show(mas0);
		System.out.println("Second generated array: ");
		show(mas1);

		System.out.println("Input insert position in the second array: ");
		int position = inputInt();
		while (position > mas1.length || position < 0) {
			System.err.println("Position can't be more than mas1.length or negative!!Reinput");
			position = inputInt();
		}
		int[] union = new int[mas0.length + mas1.length];
		union = unionOfArrFromPosition(mas0, mas1, position);
		System.out.println("Resulting array with insertion:");
		show(union);

		unionOfArrFromPositionUsingCollections(mas1, mas0, position);
	}

	private static int[] randGeneratorOfArray(int[] mas, int range) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * range);
		}

		return mas;

	}

	private static void show(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}
		System.out.println();
	}

	private static int inputInt() {
		int x = 0;
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("You inputed not an integer number!!");
			System.out.println("Input integer:");
			// переобъявляем объект sc в цикле
			sc = new Scanner(System.in);
		}
		x = sc.nextInt();
		// sc.close();
		return x;

	}

	private static void unionOfArrFromPositionUsingCollections(int[] mas1, int[] mas2, int position) {

		List<Integer> result = new ArrayList<Integer>(Arrays.asList(ArrayUtils.toObject(mas2)));
		System.out.println(result.toString());
		List<Integer> insert = new ArrayList<Integer>(Arrays.asList(ArrayUtils.toObject(mas1)));
		System.out.println(insert.toString());

		result.addAll(position, insert);
		System.out.println();
		System.out.println("Same result using collections--->");
		System.out.println(result.toString());

	}

	private static int[] unionOfArrFromPosition(int[] mas1, int[] mas2, int position) {
		int x = mas2.length + mas1.length;
		int[] union = new int[x];
		for (int i = 0; i < position; i++) {

			union[i] = mas2[i];

		}
		for (int i = position; i < (position + mas1.length); i++) {
			union[i] = mas1[i - position];
		}
		for (int i = position + mas1.length; i < union.length; i++) {
			union[i] = mas2[i - mas1.length];
		}
		return union;

	}

}
