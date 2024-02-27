package Peer.Practise;

public class FindCommonFromThreeArrays {

	public static void main(String[] args) {
		int [] arr1= {1,2,3,4,5};
		int [] arr2= {2,3,4,5,6,1};
		int [] arr3= {4,5,6,7,8,1};
		
		for(int i=0; i<arr1.length; i++) {
			for(int j= 0; j<arr2.length; j++) {
				if (arr2[j]==arr1[i]) {
					for(int k=0; k<arr3.length; k++) {
						if (arr3[k]==arr2[j]) {
							System.out.println("Common Element: "+arr3[k]);
						}
					}
				}
			}
		}

	}

}
