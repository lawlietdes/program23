package TwoPointers;

public class Diffk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A [] = {1,3,5};
		System.out.println(diffPossible(A, 4));
	}
	
	public static int diffPossible(int[] A, int B) {
		int i = 0;
		int j = 1;
		int substract = 0;
		
		while(i < A.length && j < A.length) {
			substract = A[j] - A[i];
			
			if(i == j) {
				j++;
			}else if(substract < B) {
				j++;
			}else if(substract > B) {
				i++;
			}else if (substract == B) {
				return 1;
			}
		}
		
		return 0;
	}

}
