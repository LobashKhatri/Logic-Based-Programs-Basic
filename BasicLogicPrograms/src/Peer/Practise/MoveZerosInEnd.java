package Peer.Practise;

public class MoveZerosInEnd {
	public static void main(String[] args) {
		int arr[]= {0,2,4,5,1,0,7,0,2,9};
		int arr2[]= new int [arr.length];
		int k=0;
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i]!=0) {
				arr2[k]=arr[i];
				k++;
			}else {
				continue;
			}
			
		}
		
		for(int array: arr2) {
			System.out.print(array+" ");
		}
	}
}
