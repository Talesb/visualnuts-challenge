package br.com.talesb.visualnuts.exercise1;

public class Exercise1 {

	public static void main(String[] args) {
		Exercise1.showDivisible(100);
	}
	
	
	public static void showDivisible(int numMax) {
		int numMin = 1;

		while (numMin <= numMax) {
			if(numMin%3 ==0 && numMin%5==0) {
				System.out.println("Visual Nuts");	
			}
			else if (numMin%3==0) {
				System.out.println("Visual");
			}
			else if(numMin%5==0) {
				System.out.println("Nuts");
			}else {
				System.out.println(numMin);	
			}
			numMin++;
		}
	}

}
