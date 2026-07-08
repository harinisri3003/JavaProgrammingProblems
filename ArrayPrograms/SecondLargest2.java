package ArrayPrograms;

public class SecondLargest2 {

	public static void main(String[] args) {
		int arr[] = {10,30,2,40,89,64};
		int first = 0;
		int second =0;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>first){
		        second = first;
		        first=arr[i];
		    }
		    else if(arr[i]>second){
		        second=arr[i];
		    }
		}
		
		System.out.println(second);

	}

}
