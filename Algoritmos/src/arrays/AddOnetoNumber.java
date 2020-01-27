package arrays;

import java.util.Arrays;

public class AddOnetoNumber {

	public static void main(String[] args) {
		int A[]= {0,0,1,2};
		System.out.println("aqui"+Arrays.toString(plusOne1(A)));
		
	}
    
    public static int[] plusOne1(int[] A) {
    	int Aux[];
    	if(A.length>1 && A[0]==0) {
    		int iterCero=0;
    		while(A[iterCero]==0) {
    			iterCero++;
    		}
    		Aux=new int [A.length-(iterCero)];
    		for (int i = iterCero; i < A.length; i++) {
				Aux[i-iterCero]=A[i];
			}
    	}else {
    		Aux=A; 
    	}
        if(Aux[(Aux.length)-1] + 1 < 10){
            Aux[(Aux.length)-1] += 1; 
        }else{
            int iterator=(Aux.length) - 1;
            while(Aux[iterator] + 1 == 10 ){
                Aux[iterator] = 0;
                iterator--;
                if (iterator<0) {
                	break;
                }
            }
            if(iterator<0) {
            	int A2[]=new int[Aux.length+1];
            	A2[0]=1;
            	return A2;
            }else {
            	Aux[iterator]+=1;
            }
            
            
        }
        
        return Aux;
    }
	
    
    /*public static int[] plusOne(int[] A) {
	System.out.println(Arrays.toString(A));
    long base = A.length-1;
    long value = 0;
    for(int i = 0; i < A.length;i++){
        value += A[i] * Math.pow(10,base);
        System.out.println(value);
        base--;
    }
    value = value+1;
    String auxvalue=String.valueOf(value);
    int lengt=auxvalue.length();
    base = lengt-1;
    long aux = 0;
    int arre2[] = new int [lengt];
    long aux2 = 0;
    for(int i = 0; i < lengt;i++){
        aux = value/(long)Math.pow(10,base);
        aux2 = aux/10;
        aux = aux-(aux2 * (int)Math.pow(10,1));
        arre2[i] = (int)aux;
        
        base--;
    }
    return arre2;
}*/

}
