package Peer.Practise;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int [] arr= new int[10];
		Scanner scanner= new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value: " );
			arr[i]=scanner.nextInt();
		}	//end of for loop
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int holder;
					holder=arr[j];
					arr[j]=arr[i];
					arr[i]=holder;	
				}	
			}
		}	//outer loop
		
		//Iterating
		for(int allArr: arr) {
			System.out.print(allArr);
		}
		System.out.println("");
		
		
		//BinarySearch
		int searchValue=4;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==searchValue) {
				System.out.println(searchValue+" at Index: "+ i);
			}else {
				continue;
			}
		}
		
		
	}
}
