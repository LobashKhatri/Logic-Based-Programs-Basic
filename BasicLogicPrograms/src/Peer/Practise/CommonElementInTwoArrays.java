package Peer.Practise;

public class CommonElementInTwoArrays {

	public static void main(String[] args) {
		int [] arr1= {1,2,3,4,5};
		int [] arr2= {2,3,6,7,8,12};
		
		for(int i=0; i<arr1.length;i++) {
			for(int j=0; j<arr2.length;j++) {
				if (arr2[j]==arr1[i]) {
					System.out.println("Common: "+arr2[j]);
				}
				
			}
		}
	}

}
