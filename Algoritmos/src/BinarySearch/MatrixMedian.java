package BinarySearch;

public class MatrixMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int findMedian(int[][] A, int B) {
		int left = 0;
		int right = (A[0].length * A.length) - 1;
		int midd = 0;
		int x = 0;
		int y = 0;
		
		while (left <= right ) {
			midd = (left + right) / 2;
			x = midd / A[0].length;
			y = midd % A[0].length;
			if(A[x][y] == B) {
				return 1;
			}else if(A[x][y] < B) {
				left = midd + 1;
			}else {
				right = midd - 1;
			}
		}
		return 0;
    }
}
