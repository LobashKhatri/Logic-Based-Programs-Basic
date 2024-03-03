package Peer.Practise;

public class FindLargestInt {

	public static void main(String[] args) {
		int a= 5;
		int b=1;
		int c=9;
		
		int largest= a;
		if (b>largest) {
			largest=b;
		}
		if (c>largest) {
			largest=c;
		}
		
		System.out.println(largest);
	}

}
