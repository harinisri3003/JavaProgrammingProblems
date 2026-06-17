package ArrayPrograms;

public class SearchElement {

 	public static void main(String[] args) {
 		int arr[] = {10,20,30,40,50};
 		int search_element = 70;
 		boolean status = false;
 		
 		for(int i=0;i<arr.length;i++)
 		{
 			if(arr[i] == search_element) {
 				status = true;
 				System.out.println("Number Found: " +arr[i]);
 				break;
 			}
 		}
 		
 		if(status == false) {
 			System.out.println("Number not found");
 		}
 	}
}
