package Peer.Practise;


public class VowelCount {
	public static void main(String[] args) {
		String wordString="My Name Is Lobash Khatri";
		wordString= wordString.toLowerCase();
		char [] chars=wordString.toCharArray();
		int count=0;
		for(int i=0;i<wordString.length(); i++) {
			if (chars[i]=='a'||chars[i]=='e'||chars[i]=='i'||chars[i]=='o'||chars[i]=='u') {
				count++;
			}
			
		}
		
		System.out.println("Total Vowels: "+count);
	}
}
