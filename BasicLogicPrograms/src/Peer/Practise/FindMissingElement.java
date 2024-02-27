package Peer.Practise;

public class FindMissingElement {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,6,7,8,10};	//5,9 is missing
		int count=0;
		for(int i=0; i<arr.length; i++) {
			count++;
			if (arr[i]!=count) {
				System.out.println(count+" is missing.");
				count++;
			}
		}

	}

}
