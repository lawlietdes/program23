package Sortingg;

import java.util.Arrays;

public class MergeSsort {

	public static void main(String[] args) {
		int array[]= {4,5,7,12,4,6,-1};
		System.out.println(Arrays.toString(array));
		MergeSsort obj=new MergeSsort();
		obj.sort(array);
		
		System.out.println(Arrays.toString(array));

	}
	public static void sort(int array[]) {
		sort(array, 0, array.length-1);
	}
	private static void sort(int array[],int start,int end) {
		System.out.println("start["+start+"], end["+end+"]");
		if (end<=start) {
			return;
		}
		int mid=(start+end)/2;
		sort(array,start,mid);
		sort(array,mid+1,end);
		merge(array,start,mid,end);
		
	}
	public static void merge(int array[],int start,int mid,int end) {
		int temparray[]=new int [end-start+1];
		//index counter for the left side of the array
		int leftSlot=start;
		//index counter for the right side of the array
		int rightSlot=mid+1;
		int k=0;
		
		//System.out.println("[start= "+ start+", mid= "+mid+"]  [mid+1= "+ (mid+1)+", end= "+end+"]");
		//System.out.println();
		while(leftSlot<=mid && rightSlot<=end) {
			if(array[leftSlot]<array[rightSlot]) {
				temparray[k]=array[leftSlot];
				leftSlot++;
			}else {
				temparray[k]=array[rightSlot];
				rightSlot++;
				
			}
			k++;
		}
		if(leftSlot<=mid) {
			while(leftSlot<=mid) {
				temparray[k]=array[leftSlot];
				leftSlot++;
				k++;
			}
		}else if(rightSlot<=end) {
			while(rightSlot<=end) {
				temparray[k]=array[rightSlot];
				rightSlot++;
				k++;
			}
		}
		//copy the array temp into array
		//System.out.println(Arrays.toString(temparray)+"------");
		for (int i = 0; i < temparray.length; i++) {
			//System.out.println("array["+(start+i)+"]=/ "+temparray[i]);
			//System.out.println("array["+(i)+"]= "+temparray[i]);
			array[start+i]=temparray[i];
		}
		
	}

}
