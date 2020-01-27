package arrays;

import java.util.ArrayList;

public class MaximumAbsoluteDiference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A= new ArrayList<Integer>();
		//1, 3, -1
		A.add(1);
		A.add(3);
		A.add(-1);
		System.out.println(maxArr2(A));
	}
    public static int maxArr(ArrayList<Integer> A) {
        int max=Integer.MIN_VALUE;
        for(int i = 0; i < A.size(); i++){
            for(int j = i+1; j < A.size(); j++){
                max=Math.max(max,Math.abs(A.get(i)-A.get(j))+Math.abs((i+1)-(j+1)));    
            }
        }
        return max;
    }
    public static int maxArr2(ArrayList<Integer> A) {
        int valuemax1=Integer.MIN_VALUE;
        int valuemin1=Integer.MAX_VALUE;
        
        int valuemax2=Integer.MIN_VALUE;
        int valuemin2=Integer.MAX_VALUE;
        
        for(int i = 0; i < A.size(); i++){
        	
        	valuemax1 = Math.max(valuemax1,A.get(i) + i);
        	valuemin1 = Math.min(valuemin1,A.get(i) + i);
            
            valuemax2 = Math.max(valuemax2,A.get(i) - i);
            valuemin2 = Math.min(valuemin1,(A.get(i) - i));
            
        }
        return Math.max((valuemax1-valuemin1),(valuemax2-valuemin2));
    }

}
