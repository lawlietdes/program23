package arrays;

public class MinSteps {

	public static void main(String[] args) {
		
		int A[] = { 4, 8, -7, -5, -13, 9, -7, 8};
		int B[] = { 4, -15, -10, -3, -13, 12, 8, -8}; 
		
		
		System.out.println(coverPoints(A, B));
	}
	public static int coverPoints(int[] A, int[] B) {
        int value=0;
 
        if (A.length>1){
            for(int i = 0; i < A.length-1; i++){
            	if(Math.abs(A[i]-A[i+1])<=Math.abs(B[i]-B[i+1])) {
            		value+=Math.abs(B[i]-B[i+1]);
            	}else {
            		value+=Math.abs(A[i]-A[i+1]);
            	}
                
            }
        }
        
        return value;
    }

}
