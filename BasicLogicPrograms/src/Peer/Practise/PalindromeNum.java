package Peer.Practise;

public class PalindromeNum {

	public static void main(String[] args) {
		int num=554551;
		int remainder, revNum=0, num2=num;
		while (num>0) {
			remainder=num%10;
			revNum= revNum*10+remainder;
			num/=10;
		}
		if (revNum==num2) {
			System.out.println(num2+" Is Palindrome");
		}else {
			System.out.println(num2+" Is not Palindrome.");
		}
	}

}
