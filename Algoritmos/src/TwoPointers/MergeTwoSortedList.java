package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedList {
	
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		a.add(1);
		a.add(5);
		a.add(8);
		
		b.add(3);
		b.add(4);
		merge(a, b);
		
	}
	
	public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		int totalsize = a.size()+b.size();
		ArrayList<Integer> c = new ArrayList<Integer>();
		int p1 = 0;
		int p2 = 0;
		boolean flag=false;
		for(int i = 0; i < totalsize; i++) {
			
			if(p1 >= a.size() || p2 >= b.size()) {
				if(flag == true) {
					c.add(b.get(p2));
					p2++;
				}else {
					c.add(a.get(p1));
					p1++;
				}
				
			}else {
				if(a.get(p1)<b.get(p2)) {
					c.add(a.get(p1));
					p1++;
					if(p1 == a.size()) flag = true;
				}else {
					c.add(b.get(p2));
					p2++; 
				}
			}
			
		}
		a.clear();
		for (int i = 0; i < c.size(); i++) {
			a.add(i,c.get(i));
		}
		
				
	}

}

