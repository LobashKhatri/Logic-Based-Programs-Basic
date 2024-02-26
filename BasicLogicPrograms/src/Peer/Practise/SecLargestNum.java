package Peer.Practise;

import java.util.Iterator;

public class SecLargestNum {

	public static void main(String[] args) {
		int arr[]= {5,2,3,1,5,4,8,7,10,9};
		
		int largest=Integer.MIN_VALUE;
		int secLargest= Integer.MIN_VALUE;
		
		int minimum=Integer.MAX_VALUE;
		int secMin= Integer.MAX_VALUE;
		
				
		//Finding Second Largest Value		
		for(int i= 0; i<arr.length; i++) {
			if (arr[i]>largest) {
				secLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secLargest && arr[i]!=largest) {
				secLargest=arr[i];
			}			
		}
		System.out.println();
		System.out.println("Second Largest: "+secLargest);
		
		//FInding Second minimum value:
		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j]<minimum) {
				secMin=minimum;
				minimum=arr[j];
			}else if(arr[j]<secMin && arr[j]!=minimum) {
				secMin=arr[j];
			}
		}
		System.out.println("Second Smallest: "+secMin);

	}

}
