package StringBuilder;

public class Reverse {

	public static void main(String[] args) {
		String str = "Hello";

		StringBuilder builder = new StringBuilder(str);
		
		builder.reverse();
		
		System.out.println(builder.toString());

	}

}
