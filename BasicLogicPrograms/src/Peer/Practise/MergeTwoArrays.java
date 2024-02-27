package Peer.Practise;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int [] arr1= {1,2,3,4};
		int [] arr2= {5,6,7,8};
		int i=0;
		int [] merge= new int[arr1.length+arr2.length];
		for(int array1: arr1) {
			merge[i]=array1;
			i++;
		}
		for(int array2 : arr2) {
			merge[i]=array2;
			i++;
		}
		
		for(int mergedArray: merge) {
			System.out.println(mergedArray);
		}

	}

}
