package ArrayPrograms;

public class LargestElement {

	public static void main(String[] args) {
		int arr[] = {20,40,90,5,10};
		int largest = arr[0];
		
		for(int i =1;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest = arr[i];
			}
		}
		System.out.print("Largest Number: "+largest);

	}

}
