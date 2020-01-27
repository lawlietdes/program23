package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [] = {3, 3, 0, 2, 1, 2, 1, 0, 0, 2, 0, 2, 1, 3, 0, 1, 2, 0, 0, 1, 3, 2, 0, 2, 0, 3, 2, 3, 3, 1, 3, 0, 3, 0, 0, 2, 1, 3, 0, 2, 0, 1, 2, 1, 3, 3, 1, 2, 3, 2, 3, 1, 2, 3, 3, 2, 1, 2, 1, 2, 1, 2, 2, 0, 1, 2, 3, 0, 2, 0, 0, 1, 3, 1, 1, 0, 1, 2, 2, 3, 3, 1, 2, 3, 1, 1, 0, 0, 1, 1, 2, 2, 2, 1, 2, 1, 0, 3, 2, 2, 1, 3, 3, 2, 1, 1, 1, 1, 0, 2, 1, 1, 0, 0, 0, 3, 2, 3, 0, 0, 0, 2, 3, 2, 3, 2, 0, 2, 0, 2, 3, 1, 1, 3, 1, 0, 1, 0, 2, 0, 1, 3, 1, 1, 1, 0, 1, 1, 0, 2, 0, 0, 0, 0, 1, 0, 3, 2, 3, 2, 3, 0, 0, 0, 3, 2, 1, 1, 2, 3, 2, 2, 3, 3, 2, 3, 1, 1, 2, 0, 2, 2, 2, 0, 0, 0, 1, 0, 2, 0, 0, 2, 3, 2, 2, 3, 1, 0, 2, 2, 2, 3, 3, 1, 3, 3, 1, 1, 0, 0, 1, 2, 1, 1, 2, 3, 0, 2, 1, 1, 2, 3, 0, 3, 0, 0, 3, 1, 0, 3, 2, 0, 3, 0, 1, 1, 1, 2, 2, 1, 3, 2, 3, 1, 1, 1, 0, 2, 2, 3, 2, 0, 0, 0, 1, 2, 0, 3, 1, 2, 0, 0, 3, 0, 0, 0, 1, 1, 1, 0, 3, 2, 3, 1, 1, 3, 1, 0, 3, 3, 0, 1, 2, 3, 0, 1, 1, 2, 2, 0, 1, 1, 3, 3, 0, 1, 1, 3, 0, 3, 1, 0, 0, 2, 2, 0, 3, 1, 3, 0, 0, 2, 3, 3, 2, 0, 0, 2, 2, 3, 2, 2, 3, 1, 0, 1, 2, 3, 2, 1, 0, 3, 3, 0, 1, 1, 3, 1, 3, 2, 3, 0, 3, 3, 0, 2, 3, 1, 3, 1, 1, 1, 0, 1, 3, 0, 1, 0, 1, 1, 0, 0, 3, 1, 1, 3, 2, 2, 1, 1, 2, 0, 0, 1, 1, 1, 1, 3, 2, 2, 1, 0, 3, 0, 0, 2, 3, 1, 1, 1, 2, 0, 1, 0, 1, 2, 3, 3, 3, 1, 0, 3, 2, 0, 0, 1, 0, 0, 2, 0, 3, 3, 3, 1, 2, 1, 1, 3, 3, 0, 1, 2, 3, 2, 2, 1, 3, 2, 2, 1, 3, 2, 2, 2, 2, 2, 1, 2, 0, 2, 2, 2, 0, 0, 1, 2, 2, 2, 2, 0, 1, 2, 0, 3, 0, 2, 0, 3, 2, 2, 2, 1, 1, 0, 2, 0, 2, 3, 0, 3, 1, 2, 0, 0, 1, 2, 1, 0, 0, 0, 3, 3, 2, 0, 3, 1, 0, 2, 3, 1, 3, 0, 1, 0, 2, 0, 2, 0, 1, 2, 0, 2, 3, 2, 1, 3, 1, 3, 1, 0, 3, 0, 1, 0, 2, 0, 3, 1, 1, 0, 1, 1, 3, 2, 0, 1, 3, 0, 0, 1, 3, 2, 0, 1, 0, 3, 1, 1, 0, 1, 0, 3, 2, 2, 3, 2, 0, 2, 3, 1, 2, 0, 1, 1, 3, 0, 0, 2, 1, 0, 2, 3, 3, 1, 1, 0, 3, 3, 1, 2, 2, 3, 2, 0, 2, 1, 2, 3, 0, 0, 1, 3, 2, 0, 1, 0, 1, 2, 0, 0, 1, 0, 1, 2, 1, 3, 1, 3, 3, 1, 1, 2, 0, 0, 2, 0, 1, 1, 3, 2, 1, 3, 1, 0, 3, 2, 2, 3, 3, 0, 3, 2, 3, 0, 2, 0, 1, 3, 1, 0, 0, 2, 2, 0, 1, 3, 2, 2, 3, 2, 2, 2, 3, 3, 3, 0, 1, 2, 0, 1, 0, 0, 0, 2, 0, 0, 1, 1, 0, 2, 1, 0, 3, 0, 3, 1, 1, 1, 1, 0, 2, 2, 2, 1, 3, 1, 1, 1, 3, 1, 3, 3, 3, 0, 1, 2, 2, 2, 3, 1, 2, 1, 0, 1, 3, 3, 2, 0, 1, 2, 0, 3, 1, 0, 0, 3, 3, 1, 1, 0, 1, 1, 0, 0, 3, 0, 0, 3, 1, 1, 2, 0, 0, 1, 1, 3, 0, 3, 1, 0, 2, 3, 1, 3, 2, 3, 3, 1, 3, 0, 1, 0, 2, 0, 1, 2, 0, 0, 0, 0, 1, 3, 1, 1, 0, 2, 2, 1, 3, 3, 2, 1, 3, 2, 3, 2, 1, 0, 0, 3, 0, 2, 2, 1, 1, 1, 0, 0, 2, 1, 2, 2, 2, 3, 1, 0, 1, 0, 1, 3, 1, 2, 1, 3, 1, 2, 1, 1, 0, 0, 1, 0, 0, 1, 1, 3, 2, 0, 1, 1, 2, 2, 3, 0, 1, 1, 1, 0, 3, 0, 1, 0, 1, 2, 2, 2, 2, 1, 1, 2, 3, 2, 0, 3, 2, 2, 2, 0, 1, 3, 0, 3, 2, 3, 0, 1 };
		//int array [] = {2, 0, 1, 2, 0, 3, 2, 2, 2, 1, 0, 0, 0, 1, 0, 0, 2, 2, 2, 3, 2, 3, 1, 2, 1, 2, 2, 3, 2, 3, 0, 3, 0, 2, 1, 2, 0, 0, 3, 2, 3, 0, 3, 0, 2, 3, 2, 2, 3, 1, 3, 3, 0, 3, 3, 0, 3, 3, 2, 0, 0, 0, 0, 1, 3, 0, 3, 1, 3, 1, 0, 2, 3, 3, 3, 2, 3, 3, 2, 2, 3, 3, 3, 1, 3, 2, 1, 0, 0, 0, 1, 0, 3, 2, 1, 0, 2, 3, 0, 2, 1, 1, 3, 2, 0, 1, 1, 3, 3, 0, 1, 2, 1, 2, 2, 3, 1, 1, 3, 0, 2, 2, 2, 2, 1, 0, 2, 2, 2, 1, 3, 1, 3, 1, 1, 0, 2, 2, 0, 2, 3, 0, 1, 2, 1, 1, 3, 0, 2, 3, 2, 3, 2, 0, 2, 2, 3, 2, 2, 0, 2, 1, 3, 0, 2, 0, 2, 1, 3, 1, 1, 0, 0, 3, 0, 1, 2, 2, 1, 2, 0, 1, 0, 0, 0, 1, 1, 0, 3, 2, 3, 0, 1, 3, 0, 0, 1, 0, 1, 0, 0, 0, 0, 3, 2, 2, 0, 0, 1, 2, 0, 3, 0, 3, 3, 3, 0, 3, 3, 1, 0, 1, 2, 1, 0, 0, 2, 3, 1, 1, 3, 2 };
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i : array) {
			a.add(i);
		}


		System.out.println(removeElement2(a, 0));
	}
	
	
	public static int removeElement2(ArrayList<Integer> a, int b) {	
			int p1 = 0;
			int p2 = 0;
			int aux = 0;
			int ans = 0;
			
			while(p1 < a.size()){
				
				if (a.get(p1).equals(b)) {
					
					if(p1 > p2) {
						p2 = p1;
					}
					
					while(p2 < a.size() && a.get(p2).equals(b)) {
						p2-=-1;
					}
					
					if(p2 < a.size() ) {
						aux = a.get(p1);
						a.set(p1, a.get(p2));
						a.set(p2,aux);
	
					}else {
						break;
					}
					
				}else {
					ans++;
					p1++;
				}
			}
			System.out.println(Arrays.toString(a.toArray()));
			System.out.println("ans" + ans);
			return a.size()-ans;
	    }
	
	public static int removeElement3(ArrayList<Integer> a, int b) {
		
        int iterator = 1;
       
        while(iterator < a.size()) {
            if(a.get(iterator).equals(b)) {
                a.remove(iterator);
            }else {
                
                iterator++;
            }
            
        }
        return a.size();
    
    }

}