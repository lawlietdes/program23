package arrays;

public class AdjacentElementProductt {
	public static void main(String arg[]) {
		
		int queries[]= {3, 6, -2, -5, 7, 3};
		System.out.println(adjacentElementsProduct(queries));
	}
	
	public static int adjacentElementsProduct(int[] inputArray) {
	    int center=1;
	    int maxvalue=0;
	    if (inputArray.length>1){
	        while(center<inputArray.length){
	            if(center+1<inputArray.length){
	                maxvalue=Math.max(maxvalue,Math.max(inputArray[center-1]*inputArray[center],inputArray[center+1]*inputArray[center]));
	                center+=2;
	            }else{
	                maxvalue=Math.max(maxvalue,Math.max(inputArray[center-1]*inputArray[center],maxvalue));
	                center++;
	            }
	        }
	        
	    }else{
	        return inputArray[0];     
	    }
	    return maxvalue;
	        
	    
	}


}
