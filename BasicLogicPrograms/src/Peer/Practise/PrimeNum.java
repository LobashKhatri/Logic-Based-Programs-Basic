package Peer.Practise;

public class PrimeNum {

	public static void main(String[] args) {
		int x=121;
		//Method 1:
		int count=0;
		for(int i=1; i<=x-1; i++) {
			if (x%i==0) {
				count++;
			}else {
				continue;
			}
		}
		if (count>=2) {
			System.out.println(x+" is not Prime");
		}else {
			System.out.println(x+" is Prime");
		}
		
		
		
		//Method 2:
//		boolean isPrime=true;
//		for(int i=2; i<=x/2;i++) {
//			if (x%i==0) {
//				isPrime=false;
//				break;
//			}else {
//				continue;
//			}
//		}
//		if (isPrime) {
//			System.out.println(x+" is prime");
//		}else {
//			System.out.println(x+" is not prime");
//		}

	}

}
