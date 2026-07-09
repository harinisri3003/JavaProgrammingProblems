package StringBuilder;

public class RemoveVowels {

	public static void main(String[] args) {
		String str = "Hello World";

        // Create a StringBuilder object
        StringBuilder result = new StringBuilder();

        // Check each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the character is NOT a vowel, add it
            if ("AEIOUaeiou".indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        // Print the string without vowels
        System.out.println(result);

	}

}
