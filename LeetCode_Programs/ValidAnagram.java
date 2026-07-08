package LeetCode_Programs;

import java.util.Arrays;

public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;

        char [] x = s.toCharArray();
        char [] y = t.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        for(int i =0;i<x.length;i++)
        {
            if(x[i]!=y[i]){
                return false;
            }
        }
        return true;
    } 

	public static void main(String[] args) {
		ValidAnagram obj = new ValidAnagram();
		boolean result = obj.isAnagram("anagram", "nagaram");
		System.out.println(result);

	}
}

