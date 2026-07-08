package hashMapExample;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCharacter {

	public static void main(String[] args) {
		String s = "Harini";
		Map <Character, Integer>mapvalue = new HashMap<>();
		char[] chars = s.toCharArray();
		
		for(char ch : chars)
		{
			if(!mapvalue.containsKey(ch)) {
				mapvalue.put(ch, 1);
			}
		
			else {
				int values = mapvalue.get(ch);
				mapvalue.put(ch, values+1);
			}
		}
		System.out.print(mapvalue);
	}

}
