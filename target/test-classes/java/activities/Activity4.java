package activites;

public class Activity4 {

	public static void main(String[] args) {
	int arr[]= {4,3,2,10,12,1,5,6};
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print(arr[i]);
	}

	}

}
