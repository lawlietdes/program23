package arrays;

public class ArrayManipulation {

	public static void main(String arg[]) {
		int n=10;
		int queries[][]= {{1,5,3},{4,8,7},{6,9,1}};
		System.out.println(arrayManipulation2(n,queries));
	}
	static long arrayManipulation(int n, int[][] queries) {
        long arr[]=new long [n];
        long datoold=Long.MIN_VALUE;
        long dato=0;
        for (int i=0;i<queries.length;i++){ 
            dato=regresaMayor(queries[i][0]-1,queries[i][1],queries[i][2],arr);
            if(dato>datoold){
                datoold=dato;
            }
        }
        return datoold;
    }
    static long regresaMayor(int inicio,int fin,long dato,long arr[]){
        for(int i=inicio;i<fin;i++){
            arr[i]=arr[i]+dato;
        }
        return arr[inicio];
    } 
    
    static long arrayManipulation2(int n, int[][] queries) {
       long suma=0;
       long mayor=0;
       long array[]=new long [n];
       int a=0;
       int b=0;
       long val=0;
       for (int i = 0; i < queries.length; i++) {
    	   a=queries[i][0]-1;
    	   b=queries[i][1];
    	   val=queries[i][2];
    	   if(b>n-1) {
    		   array[a]+=val;
    	   }else {
    		   array[a]+=val;
    		   array[b]-=val;
    	   }
       }
      for (int i = 0; i < array.length; i++) {
    	  suma+=array[i];
    	  mayor=Math.max(mayor, suma); 
       }
       return mayor;
    }
    
    
}
