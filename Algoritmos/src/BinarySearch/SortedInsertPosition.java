package BinarySearch;

import java.util.ArrayList;

public class SortedInsertPosition {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(5);
		a.add(6);
		
		System.out.println(searchInsert(a, 2));
	}
	
    public static int searchInsert(ArrayList<Integer> a, int b) {
    	int left=0;
    	int right=a.size()-1;
    	int midd=0;
    	int result=0;
    	while(left<=right) {
    		midd=(left+right)/2;
    		if(a.get(midd)<=b) {
    			result=midd;
    			left=midd+1;
    		}else if(a.get(midd)>b){
    			right=midd-1;
    		}
    		
    	}
    	if(a.get(result)!=b) {
    		result=left;
    	}
    	return result;
    }

}
