package Peer.Practise;

public class SecLargestInt {

	static public  void main(String[] args) {
		int a= 5;
		int b=1;
		int c=9;
		System.out.println(a+" "+b+" "+c);
		
		int largest= a;
		int secLargest=0;
		
		if(b>largest) {
			secLargest=largest;
			b=largest;
		}else if (b>secLargest) {
			secLargest=b;
		}
		
		if (c>largest) {
			secLargest=largest;
			largest=c;
		}else if (c>secLargest) {
			secLargest=c;
		}
		
		System.out.println(secLargest);

	}

}
