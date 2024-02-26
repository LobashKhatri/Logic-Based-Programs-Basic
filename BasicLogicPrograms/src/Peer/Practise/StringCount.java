package Peer.Practise;

import java.util.Iterator;

public class StringCount {

	public static void main(String[] args) {
		String nameString="LobashKhatri";
		int count=0;
		char [] chars= nameString.toCharArray();
		for(char characters: chars) {
			count++;
		}
		System.out.println(count);
		
		
//		for(char c: nameString.toCharArray()) {
//			if (c!=' ') {
//				count++;
//			}
//		}
//		System.out.println("Total: "+count);

	}

}
