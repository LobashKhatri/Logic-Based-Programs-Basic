package Peer.Practise;

public class LargestNumInArray {

	public static void main(String[] args) {
		int [] arr= {5,1,2,7,8,3,23,1312,234,12,54};
		int x= arr[0];
		for(int i=1; i<arr.length;i++) {
			if (x<arr[i]) {
				x=arr[i];
			}
		}
		System.out.println(x+" is largest Number.");
	}

}
