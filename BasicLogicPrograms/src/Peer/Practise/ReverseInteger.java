package Peer.Practise;

public class ReverseInteger {
	public static void main(String[] args) {
		int number=875421;
		int x,y=0;
		
		while (number>0) {
			x=number%10;
			y=y*10+x;
			number/=10;	
		}
		
		System.out.println(y);
	}
}
