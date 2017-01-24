package com.epam.polupan;

import java.util.Scanner;
public class PointOwnsOrNot {
	
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
	static boolean function(double x, double y){
		
		return ((Math.abs(x)<=2)&&(y>=-3)&&(y<=4))||((Math.abs(x)>2)&&(Math.abs(x)<=4))&&
		(y<=0)&&(y>=-3);
		
		
	}
	public static void main(String[] args) {
		boolean belongTo=true;
		System.out.println("Input first real number for point(x,y)--> x: ");
		double x = inputDouble();
		
		System.out.println("Input second real  number for point(x,y)-->y: ");
		double y = inputDouble();
		StringBuffer a=new StringBuffer("Point (");
		
		a.append(x);
		a.append(",");
		a.append(y);
		a.append(")");
		System.out.println(a);
		if(function(x,y)){
			System.out.println(belongTo+" to the "+a);
		}else {
			
		belongTo=false;
		System.out.println(belongTo+" to the "+a);	
		}
	}

}
