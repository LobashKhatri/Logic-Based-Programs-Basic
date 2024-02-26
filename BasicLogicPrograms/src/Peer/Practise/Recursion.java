package Peer.Practise;

public class Recursion {
	
	public static void fun(int range) {
		
		if(range > 0) {
			System.out.println(range);
			fun(range-1);
		}
	}

	public static void main(String[] args) {
		fun(10);
		

	}

}
