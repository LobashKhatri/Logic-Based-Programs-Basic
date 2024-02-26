package Peer.Practise;

public class SwappingTwoVariables {

	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		System.out.println(a+","+b);
		a=a+b;	//a=30;
		b=a-b;	//b=10;
		a=a-b;
		System.out.println(a+","+b);
		

	}

}
