package com.epam.palupan;

import java.util.Scanner;


import static java.lang.Math.*;

public class Function {
	static double inputDouble() {
		double x = 0;
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextDouble()) {
			System.out.println("You input not a real number");
			System.out.println("Input real number");

			sc = new Scanner(System.in);
		}
		x = sc.nextDouble();

		return x;
	}

	public static void main(String[] args) {
		System.out.println("Input first real  number for left side of[a,b]--> ");
		double leftOfInterval = inputDouble();

		System.out.println("Input second real number for right side of [a,b]--> ");
		double rightOfInterval = inputDouble();

		System.out.println("Input  real number for a step iterating over[a,b]--> ");
		double step = inputDouble();

		StringBuffer sb = new StringBuffer("iterating the argument on[");
		sb.append(leftOfInterval);
		sb.append(",");
		sb.append(rightOfInterval);
		sb.append("]  with step-->");
		sb.append(step);
		sb.append(" and passing it to the  function F(x)=sin^2(x)-cos(2*x):");
		System.out.println(sb);
		// System.out.println("iterating the argument on [" + leftOfInterval +
		// "," + rightOfInterval + "]"
		// + " with step-->" + step+" and passing it to the function
		// F(x)=sin^2(x)-cos(2*x):");

		function(leftOfInterval, rightOfInterval, step);
	}

	private static void function(double leftOfInterval, double rightOfInterval, double step) {
		System.out.printf("%10s %10s", "Argument", "Result");
		for (double i = leftOfInterval; i <= rightOfInterval; i += step) {
			System.out.printf("\n%10.4f %10.4f", i, sin(i) * sin(i) - cos(2 * i));

		}
	}
}
