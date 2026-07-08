package StringPrograms;

public class Palindrome {

	public static void main(String[] args) {
		//First reverse the string and compare with original and reversed string is equal
		String original = "Madam";
		String rev = "";
		
		char c[] = original.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			rev+=c[i];
		}
		
		if(original.equals(rev))
		{
			System.out.println("Palindrome: "+rev);
		}
		else
		{
			System.out.println("Not Palindrome: "+rev);
		}
	}
}
