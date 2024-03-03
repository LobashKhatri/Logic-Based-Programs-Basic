package String.Programing;

public class ComparisionString {

	public static void main(String[] args) {
		String s1= "Karachi";
		String s2= "Karachi";
		
		String s3= new String("Hyderabad");
		String s4= new String("Hyderabad");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));

	}

}
