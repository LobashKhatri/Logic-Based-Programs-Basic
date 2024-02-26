package Peer.Practise;

public class ReverseInForLoop {

	public static void main(String[] args) {
		int num=12345;
		int rev=0, rem;
		for(;num>0;num/=10) {
			rem= num%10;
			rev= rev*10+rem;
		}
		System.out.println(rev);

	}

}
