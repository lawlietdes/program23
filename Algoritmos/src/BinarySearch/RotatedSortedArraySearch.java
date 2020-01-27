package BinarySearch;

public class RotatedSortedArraySearch {

	public static void main(String[] args) {
		//int A[]= {180, 181, 182, 183, 184, 187, 188, 189, 191, 192, 193, 194, 195, 196, 201, 202, 203, 204, 3, 4, 5, 6, 7, 8, 9, 10, 14, 16, 17, 18, 19, 23, 26, 27, 28, 29, 32, 33, 36, 37, 38, 39, 41, 42, 43, 45, 48, 51, 52, 53, 54, 56, 62, 63, 64, 67, 69, 72, 73, 75, 77, 78, 79, 83, 85, 87, 90, 91, 92, 93, 96, 98, 99, 101, 102, 104, 105, 106, 107, 108, 109, 111, 113, 115, 116, 118, 119, 120, 122, 123, 124, 126, 127, 129, 130, 135, 137, 138, 139, 143, 144, 145, 147, 149, 152, 155, 156, 160, 162, 163, 164, 166, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177 };
		int A[]= {  1, 7, 67, 133, 178 };
		System.out.println(search(A, 1));
		//System.out.println(search(A, 43));
		

	}
	public static int search(final int[] A, int B) {
		int cutpoint=search2(A);
		System.out.println(cutpoint);
		int result=-1;
		
		if(cutpoint==-1) {
			result=binarySearch(A, B, 0, A.length-1);
		}else {
			int firstsearch=binarySearch(A, B, 0, cutpoint);
			if(firstsearch!=-1) {
				result = firstsearch;
			}else{
				result = binarySearch(A, B, (cutpoint+1) , A.length-1);
			}
			
		}
		
		
		return result;
	}
	public static int binarySearch(int A[],int target,int left, int right) {
		int mid = 0;
		int result=-1;
		while(left<=right) {
			mid = (left + right) / 2; 
			if(A[mid]==target){
				return mid;
			}else if(A[mid]<target) {
				left = mid+1;
			}else {
				right = mid-1;
			}
			
		}
		return result;
	}
	public static  int search2(int A[]) {
		int left = 0;
		int right = A.length-1;
		int mid = 0;
		int point = -1;
		while(left <= right){
			mid = (left + right) / 2;
			if(mid<1 || mid>=A.length-1) {
				break;
			}
			if(A[mid-1] > A[mid]) {
				point=mid-1;
				break;
			}else if(A[mid + 1] < A[mid]) {
				point=mid;
				break;
			}else if(A[mid] > A[right]) {
				left = mid+1;
			}else{
				right=mid-1;
			}
				
			
		}
		
		return point;
	}

}
