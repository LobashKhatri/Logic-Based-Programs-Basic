package Peer.Practise;

public class SumOfEvenNums {
	public static void main(String[] args) {
		int x=50;
		int sum=0;
		int count=0;		
		for (int i = 0; i <= x*2; i++) {
			if (i%2==0) {
				sum=sum+i;
			}
		}
		
		System.out.println(sum);
		
	}
}
