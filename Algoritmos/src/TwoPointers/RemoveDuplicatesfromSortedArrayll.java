package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> a = new ArrayList();
		int arreglo [] = {1,1,1,1,2,2,2,3,3,4,5};
		for (int i : arreglo) {
			a.add(i);
		} 
		System.out.println(removeDuplicates(a));

	}
	
	public static int removeDuplicates(ArrayList<Integer> a) {
		int counter = 1;
		int size = 1;
		int p1 = 0;
		int p2 = 0;
		int aux = 0;
		
		while(p2 < a.size()) {
			p2++;
			if(p2 >= a.size())break;
			if(a.get(p1).equals(a.get(p2)) && counter < 2) {
				p1++;
				counter++;
				size++;
				aux = a.get(p1);
				a.set(p1, a.get(p2));
				a.set(p2, aux);
				aux = 0;
				
			}else if(!a.get(p1).equals(a.get(p2)) && counter == 2 ) {
				p1++;
				counter = 1;
				size++;
				aux = a.get(p1);
				a.set(p1, a.get(p2));
				a.set(p2, aux);
				aux = 0;
				
			}else if(!a.get(p1).equals(a.get(p2)) && counter < 2) {
				p1++;
				size++;
				aux = a.get(p1);
				a.set(p1, a.get(p2));
				a.set(p2, aux);
				aux = 0;
				
				
			}
			
		}
		
		//System.out.println(Arrays.toString(a.toArray()));
		
		return size;
    }

}
