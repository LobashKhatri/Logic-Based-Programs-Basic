package Peer.Practise;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int []arr2=new int [arr.length];
		int k= arr.length-1;
		
		
		for (int i = 0; i < arr.length; i++) {
			arr2[k]=arr[i];
			k--;
		}
		
		for(int array: arr) {
			System.out.print(array+" ");
		}
		
		System.out.println();
		
		for(int array: arr2) {
			System.out.print(array+" ");
		}
	}
}
