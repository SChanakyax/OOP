package genericLab1;

public class SortX {
	
	void bubbleSort(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			for(int j= 0; j<n-j-1; j++) {
				if(arr[j] > arr[j+1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}


 class Main {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,12,8,9,1};
		
		SortX bs1 = new SortX();
		bs1.bubbleSort(arr);
		
		for(int i=0; i<10 ; i++) {
			System.out.println(arr[i]);
		}
		
	}
}

