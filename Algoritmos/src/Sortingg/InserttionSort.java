package Sortingg;

public class InserttionSort {
	public static void main(String[] args) {
		int array[]= {4,5,7,12,4,6,-1};
		array=insertionSort2(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

	private static int[] insertionSort(int[] array) {
		int iterator=0;
		for (int i = 0; i < array.length-1; i++) {
			iterator=i+1;
			for (int j = i; j >=0; j--) {
				if(array[iterator]<array[j]) {
					swapArray(array, iterator, j);
					iterator=j;
				}else {
					break;
				}
			}
		}
		return array;
	}
	private static void swapArray(int array[],int pos1,int pos2) {
		int aux=array[pos1];
		array[pos1]=array[pos2];
		array[pos2]=aux;
	}
	
	private static int[] insertionSort2(int[] array) {
		//i= el elemento q no está dentro de la parte ordenada
		for (int i = 1; i < array.length; i++) {
			int value=array[i];
			//j es a partir del elemento dentro de la parte ordenada 
			int j=i-1;
			while(j>=0 && array[j]>value) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=value;
		}
		return array;
	}
	

}
