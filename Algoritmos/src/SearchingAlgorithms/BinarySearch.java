package SearchingAlgorithms;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String args[]) {
		int array[]= {1,2,4,8,11,24,55,76,88,99,101};
		int array2[]= {101,2,1,11,24,4,76,88,99,8,55};
		
		System.out.println(binarySearch(array, 3));
		System.out.println(binarySearch2(array2, 3));
		
	}
	
	public static int binarySearch(int array[], int val) {
		int left=0;
		int right=array.length-1;
		int center=0;
		boolean flag=false;
		
		while(left<=right && flag==false) {
			center=(left+right)/2;
			System.out.println("center= "+center);
			if(array[center]==val) {
				flag=true;
			}else {
				if(array[center]<val)left=center+1;
				else right=center-1;
			}
		}
		if (flag==true)return center;
		else return -1;
		
	}
	
	public static int binarySearch2(int arreglo[],int valor) {
		Arrays.sort(arreglo);
		int izq=0;
		int der=arreglo.length-1;
		int centro=0;
		boolean bandera=false;
		
		while(izq<=der && bandera==false) {
			centro=(izq+der)/2;
			if(arreglo[centro]==valor)bandera=true;
			else {
				if(arreglo[centro]<valor)izq=centro+1;
				else der=centro-1;
			}
		}
		
		if(bandera==true)return centro;
		else return -1;
		
	}

}
