package com.epam.palupan;

public class Array {
	private int mas[];

	public Array(int x) {
		mas = new int[x];
	}

	public void create(int range) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * range);
		}
	}
	public  void sumElements(int k){
		int sum=0;
		for(int element:this.mas){
			
			if(element%k==0){
				sum+=element;
			}
		}
		System.out.println("Sum of the array's elements divided by k-->"+sum);
			
		}
	public void show() {
		System.out.println(" Generated array: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}
		System.out.println();
	}
}
