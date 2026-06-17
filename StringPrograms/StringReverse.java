package StringPrograms;

public class StringReverse {

	public static void main(String[] args) {
		String s = "Harini";
		String rev = "";
		
		//Approach 1
		/*
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}

		System.out.println(rev);
		*/
		
		//Approach 2

		char c[] = s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			rev+=c[i];
		}
		System.out.println(rev);
	}
}
