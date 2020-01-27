package arrays;

public class AlmostIncreasSequence {

	public static void main(String[] args) {
		int arreglo[]= {1, 3, 2,3,4};
		System.out.println(almostIncreasingSequence(arreglo));

	}
	static boolean almostIncreasingSequence(int[] sequence) {
	    
	    if(sequence.length<=2){
	        return true;
	    }
	    
	    for(int i=0; i<sequence.length-1;i++){
	        if(sequence[i]>=sequence[i+1]){
	            int arreaux1[]=new int[sequence.length];
	            int arreaux2[]=new int[sequence.length];
	           
	            
	            System.arraycopy(sequence, 0, arreaux1, 0, i);
	            System.arraycopy(sequence, i, arreaux1, i, (sequence.length)-(i+1));
	            
	            System.out.println("");
	            for (int j = 0; j < arreaux1.length; j++) {
	            	System.out.println(arreaux1[j]);
				}
	            System.arraycopy(sequence, 0, arreaux2, 0, i+1);
	            System.arraycopy(sequence, i+1, arreaux2, i+1, (sequence.length)-(i+1));
	            System.out.println("__________--");
	            System.out.println("__________");
	            for (int j = 0; j < arreaux2.length; j++) {
	            	System.out.println(arreaux2[j]);
				}
	            if(almostaIncreasingSequence2(arreaux1) || almostaIncreasingSequence2(arreaux2)){
	                return true;
	            }
	        }
	    }
	    return false;
	    
	    
	}
	static boolean almostaIncreasingSequence2(int array []){
	    if(array.length==2){
	        if(array[0]<array[1]){
	            return true;
	        }else{
	            for(int i=0; i<array.length;i++){
	                if(array[i]>=array[i+1]){
	                    return false;
	                }
	            }
	            return true;
	        }
	    }
	    return false;
	}


}
