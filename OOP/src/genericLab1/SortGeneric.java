package genericLab1;

public class SortGeneric <T extends Number>{

	
	void bubbleSort(T arr[]) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			for(int j= 0; j<n-j-1; j++) {
				if(arr[j].doubleValue() < arr[j+1].doubleValue()) {
					//swap
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	
	
}
