package TwoPointers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> A = new ArrayList<Integer>();
		int array [] = { 5, -2, -1, -10, 10};
			//{-1,2,1,-4}; 
	//	A : [ -5, 1, 4, -7, 10, -7, 0, 7, 3, 0, -2, -5, -3, -6, 4, -7, -8, 0, 4, 9, 4, 1, -8, -6, -6, 0, -9, 5, 3, -9, -5, -9, 6, 3, 8, -10, 1, -2, 2, 1, -9, 2, -3, 9, 9, -10, 0, -9, -2, 7, 0, -4, -3, 1, 6, -3 ]
//				B : -1
		//-1
			//{-1,2,1,-4};
		for (int i : array) {
			A.add(i);
		}
		threeSumClosest(A, 5);

	}
	
	public static int threeSumClosest(ArrayList<Integer> A, int B) {
		int p1 = 0;
		int p2 = 1;
		int p3 = A.size() - 1;
		int ans = Integer.MAX_VALUE;
		int sum = 0;
		int aux = Integer.MAX_VALUE;
		Collections.sort(A);
		while(true) {
			sum = A.get(p1) + A.get(p2) + A.get(p3);
			System.out.println("sum= "+sum);
			System.out.println("SUMA - B = "+ Math.abs(sum-B) );
			if(Math.abs(sum-B) < aux) {
				ans = sum;
			}
			aux = Math.abs(sum - B);
			System.out.println("SUMA= "+ sum + " ans= "+ ans);
			//ans = Math.min(ans, (A.get(p1) + A.get(p2) + A.get(p3)) - B);
			
			System.out.println(A.get(p1)+"/" + A.get(p2)+"/" + A.get(p3));
			System.out.println("-----------------------------------");
			if(B == ans) {
				break;
			}
			if( B < sum && (p3-1==p2 || p3-1 == p1)) {
				break;
			}
			if (B > sum && p1+1 == p3 ) {
				break;
			}
			if( B > sum) {
				if(p1+1 == p2) {
					p1+=2;
				}else {
					p1++;
				}
					
			}else if(B < sum && p3-1 > p2) {
				p3--;
			}
			
		}
		System.out.println(ans);
		
		return ans;
    }

}
