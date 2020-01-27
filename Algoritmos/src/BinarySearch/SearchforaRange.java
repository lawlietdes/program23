package BinarySearch;

import java.util.Arrays;

public class SearchforaRange {

	public static void main(String[] args) {
		int A[]= {5, 7, 7,8, 8, 8, 10};
		System.out.println(Arrays.toString(searchRange(A, 8)));
	}
	public static int[] searchRange(final int[] A, int B) {
		int response[] = {-1,-1};
		response[0]=binarySearch2(A, B, true);
		response[1]=binarySearch2(A, B, false);
		return response;
    }
	public static int binarySearch2(int A[],int B,boolean searchFirst) {
		int midd=0;
		int left = 0;
		int right =  A.length-1;
		int response=-1;
		
		while(left <= right) {
			midd = (left+right)/2;
			if(A[midd] == B) {
				response  = midd;
				
				if(searchFirst) {
					right = midd - 1;
				}else {
					left = midd + 1;
				}
				
			}else if(A[midd] < B) {
				left = midd + 1;
			}else {
				right = midd-1;
			}
		}
		
		return response;
	}

}
