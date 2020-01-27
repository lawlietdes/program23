package arrays;

import java.util.Arrays;

public class WaveArray {

	public static void main(String[] args) {
		int A[]= {1};
		System.out.println(Arrays.toString(wave(A)));

	}
	public static  int[] wave(int[] A) {
		Arrays.sort(A);
		
		for (int i = 0; i < A.length-1; i+=2) {
			System.out.println(i);
			swap(A, i,i+1);
		}
		return A;
		
	}
	public static void swap(int A[], int pos1, int pos2 ) {
		int aux=A[pos1];
		A[pos1]=A[pos2];
		A[pos2]=aux;
	}

}
