package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RotateMatrix {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
		int num=1;
		for (int i = 0; i <2;i++) {
			ArrayList<Integer> dentro=new ArrayList<Integer>();
			for (int j = 0; j < 2; j++) {
				dentro.add(num++);
			}
			a.add(dentro);
		}
		
		volteaMatriz(a);
	}

    public static void volteaMatriz(ArrayList<ArrayList<Integer>> a) {
        a=rotate2(a);
        for (int i = 0; i <2;i++) {
			
        	System.out.print(Arrays.toString(a.get(i).toArray()));
			
		}
		
    }
    public static ArrayList<ArrayList<Integer>> rotate2(ArrayList<ArrayList<Integer>>a){
        ArrayList<ArrayList<Integer>> a2=new ArrayList<ArrayList<Integer>>();
        for (int i =0; i <a.size(); i++) {
            ArrayList<Integer> dentro=new ArrayList<Integer>();
            for (int j = a.size()-1,k=0; j >= 0; j--,k++) {
                dentro.add(a.get(j).get(i));
                
            }
            a2.add(i,dentro);
        }
      
        return a2;
    }

}
