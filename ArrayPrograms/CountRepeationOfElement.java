package ArrayPrograms;

public class CountRepeationOfElement {

	public static void main(String[] args) {
		int arr[] = {100,200,300,100,400};
		int num = 100;
		int count = 0;
		
		for (int i =0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				count+=1;
			}
		}
		
		System.out.println(count);
	}

}
