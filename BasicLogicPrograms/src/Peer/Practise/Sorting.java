package Peer.Practise;

import java.util.Iterator;
import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		int arr[]= new int[6];
		Scanner inScanner = new Scanner(System.in);
		for(int i= 0; i<arr.length;i++) {
			System.out.print("Enter Value: ");			
			arr[i]=inScanner.nextInt();
		}
		//{5,2,1,3,6,4}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp;
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}	//outer loop
		
		for(int sortedArr: arr) {
			System.out.print(+sortedArr+" ");
		}
		
		int length= arr.length;
		System.out.println("\nSecond Largest: "+arr[length-2]);
		System.out.println("Second Smallest: "+arr[1]);

	}
}
