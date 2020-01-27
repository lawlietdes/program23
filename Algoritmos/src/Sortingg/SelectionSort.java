package Sortingg;

public class SelectionSort {

	public static void main(String[] args) {
		int array[]= {4,5,7,12,4,6,-1};
		array=sortSelection(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	public static int[] sortSelection(int array[]) {
		for (int i = 0; i < array.length; i++) {
			int posminimum=i;
			for (int j = i+1; j < array.length; j++) {
				if(array[j]<array[posminimum]) {
					posminimum=j;
				}
			}
			swapCouples(array, i, posminimum);
		}		
		return array;
	}
	
	public static void swapCouples(int array[],int pos1, int pos2) {
		int aux=array[pos1];
		array[pos1]=array[pos2];
		array[pos2]=aux;
	}
	
}