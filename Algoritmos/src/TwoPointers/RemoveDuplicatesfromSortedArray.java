package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int arreglo []= {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3 };
		//int arreglo [] = {1,1,2,3};
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println(arreglo.length);
		for (Integer var : arreglo) {
			a.add(var);
		}
		System.out.println(removeDuplicates(a));
	}
	
	public static int removeDuplicates(ArrayList<Integer> a) {
        int p1 = 0;
        int p2 = 1;
        int ans = 1;
        int aux = 0;
		while(p2 < a.size()) {
        	if(a.get(p1).equals(a.get(p2))) {
        		p2++;
        		
        	}else {
        		p1++;
        		aux = a.get(p1);
        		a.set(p1,a.get(p2));
        		a.set(p2,aux);
        		p2++;
        		ans++;
        	}
        	
        }
		//System.out.println(Arrays.toString(a.toArray()));
		return ans;
    }
	public static int removeDuplicates2(ArrayList<Integer> a) {
        int aux = a.get(0);
        int iterator = 1;
       
        while(iterator < a.size()) {
            if(a.get(iterator).equals(aux)) {
                a.remove(iterator);
            }else {
                aux = a.get(iterator);
                iterator++;
            }
            
        }
        return a.size();
    }
	
	
}
