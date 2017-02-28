package com.apex.ecommerce.core;

public class TestRevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Sakandar";
		String rev = "";
		for(int i=str.length()-1; i>=0; i--){
			rev += str.charAt(i);
		}

		System.out.println("Reverse is   " + rev);
	}

}
