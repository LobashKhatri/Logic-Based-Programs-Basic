package Peer.Practise;

public class LargestNum {

	public static void main(String[] args) {
		int arr[]= {5,3,1,2,4,8,2,8};
		int max= arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("Maximum value: "+max);

	}

}
