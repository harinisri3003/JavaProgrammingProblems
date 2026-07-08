package HackerRank_Programs;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev = "";
        
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        
        if(rev.equals(str)){
            System.out.print("Yes");
        }
        else
        System.out.print("No");
    }

	}
