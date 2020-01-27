package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaxProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,1,2,3};
					  
		maxSpecialProduct(array);
	}
	public static int maxSpecialProduct(int[] A) {
		Stack<Integer> stack = new Stack<Integer>(); 
		int iterator=0;
		int maxright [] = new int [A.length];
		int maxleft [] = new int [A.length];
		int i=0;
		boolean flag=false;
		stack.push(A[0]);
		while (i < A.length) {
			
			while(!stack.isEmpty()) {
				
				if(!flag)
					iterator++;

				if(iterator >= A.length) {
					i = iterator;
					break;
				}
					
				if(A[iterator] > stack.peek()) {
					System.out.println("El mayor de " + stack.peek() + " es " + A[iterator]);
					maxright[i] = A[iterator];
					stack.pop();
					flag=true;
					i--;
					
					if(stack.isEmpty()) {
						stack.push(A[iterator]);
						flag = false;
						i = iterator;
					}
				}else {
					if(flag) {
						stack.add(A[iterator]);
						flag = false;
						i = iterator;
					}else {
						i++;
						stack.add(A[i]);
					}
				}
			}
		}
		
		for (int j = 0; j < maxright.length; j++) {
			System.out.print(maxright[j]+",");
		}
		System.out.println("\n-------");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		return 0;
    
	}

}
