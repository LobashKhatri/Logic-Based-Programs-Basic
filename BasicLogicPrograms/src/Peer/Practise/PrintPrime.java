package Peer.Practise;

public class PrintPrime {

	public static void main(String[] args) {
		int range=100;
		for(int i=1; i<range; i++) {
			for(int j=1; j<range-1;j++) {
				int count=0;
				if (j%i==0) {
					count++;
				}
				if (count<2) {
					System.out.println(j);
				}
			}
			
		}

	}

}
