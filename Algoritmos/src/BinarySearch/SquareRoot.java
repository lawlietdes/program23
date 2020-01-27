package BinarySearch;

public class SquareRoot {
	
	public static void main (String args[]) {
		System.out.println(sqrt(9));
	}
	
	public static int sqrt(int A){
        long ini = 0;
        long fin = A;
        long mid = (ini+fin)/2;
        long sol = 0;
        
        while(ini <= fin){
            mid = (ini + fin)/2;
            long mid2 = mid*mid;
            
            if((mid2) <= A){
                sol = mid;
                ini = mid+1;
            }else{
                fin = mid-1;
            }
            
        }
        
        return (int)sol;
        
    }
}
