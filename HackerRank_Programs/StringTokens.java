package HackerRank_Programs;

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        
        //[ ... ] means match any one character inside the brackets.
        //+ means one or more occurrences of the preceding pattern.
        String arr[] = s.split("[ !,?._'@]+");
        System.out.println(arr.length);
        for(String word:arr){
            System.out.println(word);
        }

	}

}
