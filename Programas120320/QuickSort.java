package Sortingg;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HOLA MUNDO ");
		int array[]= {4,5,7,12,4,6,-1};
		
		System.out.println(Arrays.toString(array));
		quickSort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}
	
	
	public static void quickSort(int [] array, int l, int r) {
		if(l<r){
			int pivote = partition(array,l,r);
			quickSort(array, l, pivote-1);
			quickSort(array, pivote+1, r);
		}
	}
	public static int partition(int [] array, int l, int r) {
		
		int pivote =  r;
		int i = l-1;
		int j = l;
		
		while(j <= pivote) {
			if( array[j] <= array[pivote] ) {
				i++;
				int aux = array[i];
				array[i] = array[j];
				array[j] = aux;
				j++;
			}else {
				j++;
			}
		}
		return i;
	}
	

}
