package com.epam.polupan;

import java.util.Scanner;

public class SquareOrQuadroDegree {
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
		System.out.println("Input first real  number --> x: ");
		double x = inputDouble();
		
		System.out.println("Input second real  number -->y: ");
		double y = inputDouble();
		
		System.out.println("Input second real  number -->z: ");
		double z = inputDouble();	
		System.out.println("x="+x+" y="+y+" z="+z); 
		double[] arr={x,y,z};
		for(double member:arr){
			
			if(member<0){
				member=Math.pow(member,4);
			}else {
				member=Math.pow(member,2);
			}
			System.out.print(member+" ");
			}
		
		}
	
	}


