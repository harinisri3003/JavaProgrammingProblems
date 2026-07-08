package HackerRank_Programs;

import java.util.Scanner;

public class JavaStringsIntroduction {

	public static void main(String[] args) {
		
			//Getting Input from User
	       Scanner sc = new Scanner(System.in);
	       String first_String = sc.next();
	       String second_String = sc.next();
	       
	       //Checking its length and giving the count for both the strings
	       System.out.println(first_String.length()+second_String.length());
	       
	       //Comparing whether A is greater than B
	       //Here we pass >0 since this method gives the negative number if it fails
	       //so if it gives negative number then print Yes or No
	       if(first_String.compareTo(second_String)>0)
	       System.out.println("Yes");
	       else
	       System.out.println("No");
	       
	       //Converting first letter to uppercase and merge the order words
	       String first_word = first_String.substring(0,1).toUpperCase() + first_String.substring(1);
	       String second_word = second_String.substring(0,1).toUpperCase() + second_String.substring(1);
	       
	       System.out.println(first_word +" " +second_word);
	    }
}
