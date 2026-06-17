package StringPrograms;

import java.util.Arrays;

public class StringBuilt_In_MethodExamples {

	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "Harini";
		String s3 = "   Harini  ";
		String s4 = "Harini123@gmail.com";

		System.out.println("Length of the String: "+s1.length());
		
		System.out.println("Concat of S1 and S2: "+s1.concat(s2));
		
		System.out.println("Trimming the whitespace: "+s3.trim());
		
		System.out.println("Substring: "+s2.charAt(3));
		
		System.out.println("Contains Example: "+s2.contains("ri"));
		
		String arr[] = s4.split("@");
		System.out.println(Arrays.toString(arr));
	}

}
