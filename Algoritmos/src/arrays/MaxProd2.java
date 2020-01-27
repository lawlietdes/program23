package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaxProd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {5,9,6,8,6,4,6,9,5,4,9};
					//9 0 8 9 9 6 9 0 9 9 0    
		maxSpecialProduct(array);
	}
	public static int maxSpecialProduct(int[] A) {
        int maxright [] = maxRight(A);
        int maxleft [] = maxLeft(A);
        long maxvalue=Long.MIN_VALUE;
        
        for (int i = 0; i < maxright.length; i++) {
            maxvalue=Math.max(maxvalue, (long)maxright[i]*maxleft[i]);
        }
        
        return (int)(maxvalue%1000000007);
    }
    public static int[] maxRight(int A []) {
        Stack<Integer> stack = new Stack<Integer>(); 
        int iterator=0;
        int maxright [] = new int [A.length];
        boolean flag=false;
        
        stack.push(0);
        
        while (iterator < A.length) {
            
            while(!stack.isEmpty()) {
                
                if(!flag)
                    iterator++;

                if(iterator >= A.length) {
                    break;
                }
                    
                if(A[iterator] > A[stack.peek()]) {
                    //System.out.println("El mayor de " + stack.peek() + " es " + A[iterator]);
                    maxright[stack.pop()] = iterator;
                    flag = true;
                    
                    if(stack.isEmpty()) {
                        stack.push(iterator);
                        flag = false;
                        
                    }
                }else {
                    if(flag) {
                        stack.push(iterator);
                        flag = false;
                        
                    }else {
                        stack.push(iterator);
                        
                    }
                }
            }
        }
        return maxright;
    }
    public static int [] maxLeft(int A[]) {
        Stack<Integer> stack = new Stack<Integer>(); 
        int iterator=A.length-1;
        int maxleft [] = new int [A.length];
        boolean flag=false;

        stack.push(A.length-1);
        
        while (iterator>=0) {
            while(!stack.isEmpty()) {
                if(!flag) 
                    iterator--;
                
                if(iterator < 0)
                    break;
                
                if(A[iterator] > A[stack.peek()]) {
                    maxleft[stack.pop()] = iterator;
                    flag = true;
                    
                    if(stack.isEmpty()) {
                        stack.push(iterator);
                        flag = false;
                    }
                    
                 }else {
                     if(flag) {
                         stack.push(iterator);
                         flag = false;
                         
                     }else {
                         stack.push(iterator);
                     }
                 }
                
                
            }
            
        } 
        
        return maxleft;
    }

}
