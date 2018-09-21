
public class ThirdLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {60, 10, 70, 20, 30, 40, 50};
		int[] arr = {60, 50, 40, 30, 20, 10, 5};
		int first = arr[0];
		int second=-1;
		int third=-1;
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]>first){
				third=second;
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second && arr[i]<first){
				third = second;
				second = arr[i];
			}
			else if(arr[i]>third && arr[i]<second){
				third = arr[i];
			}
		}
		
		System.out.println("Third Largest :- "+third);
		System.out.println("Second Largest :- "+second);
		System.out.println("Largest :- "+first);
	}

}
