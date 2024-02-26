package Peer.Practise;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[]= {8,2,4,2,8,5,9,1};
		int dummy[]= new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp;
					temp= arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}	
		}	//outer loop ended
		
		for(int sortedArr: arr) {	//iterate:
			System.out.print(sortedArr);
		}
		System.out.println("");
		
		//{1,2,2,4,5,8,8}
		
		//Removing the duplicates...
		int j=0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]!=arr[i+1]) {
				dummy[j]=arr[i];
				j++;		
			}
		}
		dummy[j]= arr[arr.length-1];
		
		
		for (int i = 0; i < j+1; i++) {
			System.out.print(dummy[i]);
			
		}
		
		
	}
}
