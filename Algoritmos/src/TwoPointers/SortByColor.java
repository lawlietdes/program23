package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class SortByColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> a = new ArrayList<Integer>();
		int array [] = {0 ,1,2,0,1,2};
		for (int i : array) {
			a.add(i);
		}
		sortColors(a);

	}
    public static void sortColors(ArrayList<Integer> a) {
        int zero = 0;
        int one = 0;
        int two = 0;
        int startone = 0;
        int starttwo = 0;
        for(int i = 0; i< a.size(); i++){
            if(a.get(i).equals(0)){
                zero++;
            }else if(a.get(i).equals(1)){
                one++;
            }else if(a.get(i).equals(2)){
                two++;
            }
        }
        for (int i = 0; i < (zero + one + two); i++) {
			if(i < zero) {
				a.set(i, 0);
			}
			if(i >= zero && i < (zero + one)) {
				a.set(i, 1);
			}
			if(i >= (zero + one)  && i < (zero + one + two)) {
				a.set(i, 2);
			}
        	
		}
        System.out.println(Arrays.toString(a.toArray()));
        
    }

}
