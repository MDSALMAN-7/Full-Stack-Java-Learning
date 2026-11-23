package com.collection.basic1;

public class Driver {
	public static void main(String[] args) {
		// 1. store the price --> container(box) which holds integer value
		int[] price = {200,334,5678,43,100,256,6756};
		
		// 2. process --> find the price value above 1000
		for(int i = 0; i<price.length; i++) {
			int currentPrice = price[i];
			
			if(currentPrice>1000) {
				System.out.println(currentPrice);
			}
		}
	}
}
