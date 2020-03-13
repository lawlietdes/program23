package Sortingg;

import java.util.Arrays;

public class MergeSsort {

	public static void main(String[] args) {
		int array[]= {4,5,7,12,4,6,-1};
		System.out.println(Arrays.toString(array));
		MergeSsort obj=new MergeSsort();
		obj.mergeSort(array,0,array.length-1);
		
		System.out.println(Arrays.toString(array));

	}
	public static void mergeSort(int mainarre[], int l, int r) {
		if(l<r) {
			
			int mid = (l+r) / 2;
			mergeSort(mainarre,l,mid);
			mergeSort(mainarre, mid+1, r);
			merge(mainarre, l, mid, r);
		}
	} 
	public static void merge(int mainarre[],int l,int mid,int r) {
		int p1 = l;
		int p2 = mid+1;
		int p3 = 0;
		int arreaux[] = new int[r-l+1]; 

		while(true) {
			if(p1 > mid && p2 > r) {
				break;
			}else if(p1 <= mid && p2 > r) {
				arreaux[p3] = mainarre[p1];
				p1++;
			}else if(p2 <= r && p1 > mid) {
				arreaux[p3] = mainarre[p2];
				p2++;
			}else if(mainarre[p1] < mainarre[p2]) {
				arreaux[p3] = mainarre[p1];
				p1++;
			}else{
				arreaux[p3]= mainarre[p2];
				p2++;
			}
			p3++;
		}
		
		for (int i = 0; i < arreaux.length; i++) {
			mainarre [l + i] = arreaux [i];
		}
		
	}

}
