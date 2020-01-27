package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfSortedArrays {

	public static void main(String[] args) {
		ArrayList <Integer> A = new ArrayList <Integer> ();
		ArrayList <Integer> B = new ArrayList <Integer> ();
		ArrayList <Integer> ans = new ArrayList <Integer> ();
		
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(3);
		A.add(4);
		A.add(5);
		A.add(6);
		
		B.add(3);
		//B.add(3);
		B.add(5);
		
		ans = intersect(A, B);
		System.out.println(Arrays.toString(ans.toArray()));
		
	}
	
	public static ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
		int p1 = 0;
		int p2 = 0;
		ArrayList <Integer> ans = new ArrayList <Integer> ();
		if(A.size()==1 && B.size() == 1 && A.get(0) == B.get(0)) {
			ans.add(A.get(0));
			return ans;
		}
		while(true) {
			if(A.get(p1).equals(B.get(p2))) {
				ans.add(A.get(p1));
				if(p1+1 < A.size() && p2+1 < B.size()) {
					p1++;
					p2++;
				}else {
					break;
				}
			}else if(A.get(p1) > B.get(p2)) {
				if(p2+1 < B.size()) {
					p2++;
				}else {
					break;
				}
			}else {
				if(p1+1 < A.size()) {
					p1++;
				}else {
					break;
				}
					
			}
			
		}
		return ans;
	}
	
	
	

}
