package com.epam.polupan;

public class ArrayStore {
	private int mas[];

	public ArrayStore(int x) {
		mas = new int[x];
	}

	public void create(int range) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * range);
		}
	}
	
	public void show() {
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}
		System.out.println();
	}
	public ArrayStore unionArrays(ArrayStore arrInsertTo,int position){
		int sizeUnionArr=arrInsertTo.getMasLength()+this.getMasLength();
		
		ArrayStore unionArr=new ArrayStore(sizeUnionArr);
		for(int i=0;i<mas.length;i++){
			
		}
		unionArr.show();
		
		return unionArr;
		
	}
public int getMasLength(){
	return mas.length;
}
	
	public int[] getMas() {
		return mas;
	}

	public void setMas(int[] mas) {
		this.mas = mas;
	}
}
