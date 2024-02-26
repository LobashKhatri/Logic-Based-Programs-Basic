package Peer.Practise;


public class Fibo {
	public static void main(String[] args) {
		//0 1 1 2 3 5 8...
		
		int a=0, b=1, temp;
		System.out.print(a+" "+b);
		
		for (int i = 0; i < 10; i++) {
			temp=a+b;
			System.out.print(" "+temp);
			a=b;
			b=temp;
			
		}
	}
}