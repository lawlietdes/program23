package BinarySearch;

public class MatrixSearch {

	public static void main(String[] args) {
		int A[][]= { {1,   3,  5,  7},
		            {10, 11, 16, 20},
		            {23, 30, 34, 50}  };
		System.out.println(searchMatrix(A, 11));

	}
	public static int searchMatrix(int[][] A, int B) {
        int response = 0;
        for (int i = 0; i < A.length; i++) {
            if(binarySearch(A[i], B) == 1) {
                return 1;
            }
        }
        

        return response;
    }
     public static int binarySearch(int A[],int B) {
        int left = 0;
        int right = A.length-1;
        int midd = 0;
        int response=0;
        while(left <= right) {
            midd = (left + right) / 2;
            if(A[midd] == B) {
                return 1;
            }else if(A[midd] < B) {
                left = midd+1;
                
            }else {
                right = midd-1;
                
            }
        }
        
        return response;
    }

}
