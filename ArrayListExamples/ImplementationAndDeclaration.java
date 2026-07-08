package ArrayListExamples;

import java.util.ArrayList;

public class ImplementationAndDeclaration {

	public static void main(String[] args) {
		//create ArrayList for all the datatype
		ArrayList mylist = new ArrayList();
		
		//create ArrayList for specific datatype
		//ArrayList <Integer> mylist2 = new ArrayList<Integer>();
		
		//Adding elements
		mylist.add(100);
		mylist.add('H');
		mylist.add("Harini");
		mylist.add(10.5);
		mylist.add(null);
		
		//Printing
		System.out.println(mylist);
		
		//size
		System.out.println(mylist.size());
		
		//remove element
		System.out.println(mylist.remove(3));
		System.out.println(mylist);
		
		//insert element in between
		mylist.add(2,'H');
		System.out.println(mylist);
	
		//modify or replace
		System.out.println(mylist.set(2,"Hari"));
		System.out.println(mylist);
		
		//specific element
		System.out.println(mylist.get(2));
		
		//remove all elements
		mylist.clear();
		System.out.println(mylist);
		

	}

}
