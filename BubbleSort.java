package com.test.java.practice;

import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort{
	public static void main (String args[]) {

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number of elements you want in  the array");
		int num =scanner.nextInt();
		int[] array = new int[num];
		System.out.println("enter all those numbers");
		for(int i=0;i<num;i++) {
			array[i]=scanner.nextInt();
		}

		System.out.println("Array is"+Arrays.toString(array));
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println("Array is"+Arrays.toString(array));

	}

}
