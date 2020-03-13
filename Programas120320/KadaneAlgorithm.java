package arrays;

import java.util.ArrayList;
import java.util.List;

public class KadaneAlgorithm {

	public static void main(String args[]) {
		int a[] =  {-2, -3, 4, -2, -2, 1, 5, -3}; 
		System.out.println(kadane(a,6));
	}
	
	public static int kadane(int array[], int target) {
		int ansMax = 0;
		int localMax = 0;
		List<Integer> lista = new ArrayList();
		
		for (int i = 0; i < array.length; i++) {
			
			localMax = localMax + array[i];
			
			if(localMax > ansMax) {
				ansMax = localMax;
				
			}else if(localMax < 0 ) {
				localMax = 0;
				lista.clear();
			}
			
			
		}
		System.out.println(lista.toString());
		return ansMax;
	}
		
		
}
