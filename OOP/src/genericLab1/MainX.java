package genericLab1;

public class MainX {

	public static void main(String[] args) {
		SortGeneric<Double> sg = new SortGeneric<Double>();
		
		Double[] arr = {1.0,5.0,8.0,9.0,2.0,3.0,6.0,7.0,4.0,5.0}; 
		
		sg.bubbleSort(arr);

	
for(int i=0; i<10 ; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
