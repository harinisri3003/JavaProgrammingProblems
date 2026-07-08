package HackerRank_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String A = sc.next().toLowerCase();
        String B = sc.next().toLowerCase();

        if (A.length() != B.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        char[] x = A.toCharArray();
        char[] y = B.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i]) {
                System.out.println("Not Anagrams");
                return;
            }
        }

        System.out.println("Anagrams");

	}

}
