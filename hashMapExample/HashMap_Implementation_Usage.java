package hashMapExample;

import java.util.HashMap;

public class HashMap_Implementation_Usage {

	public static void main(String[] args) {
		//Declaring
		
		//HashMap myhashmap = new HashMap();
		HashMap <Integer,String> myhashmap = new HashMap<Integer,String>();
		
		//Adding pairs
		myhashmap.put(100,"Sai");
		myhashmap.put(101,"Hari");
		myhashmap.put(102,"Sri");
		myhashmap.put(1004,"Unknown");
		
		//printing
		System.out.println(myhashmap);
		
		//remove pairs
		myhashmap.remove(1004);
		System.out.println(myhashmap);
		
		//access all key
		myhashmap.keySet();
		
		//access all values
		myhashmap.values();
		
		//access values from the key
		System.out.println(myhashmap.get(100));
		
		//retrieve all keys and values
		System.out.println(myhashmap.entrySet());
		
		//print all values using enhanced for loop
		for(int k: myhashmap.keySet())
		{
			System.out.println(myhashmap.get(k));
		}		
	}
}
