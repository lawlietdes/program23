package Stringss;

import java.util.ArrayList;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayl = new ArrayList<String>();
		arrayl.add("ABCD");
		
		System.out.println(longestCommonPrefix(arrayl));
	}
	
	public static  String longestCommonPrefix(ArrayList<String> A) {
		int p1 = 0;
		int ans = Integer.MAX_VALUE;
		String wordans = "";
		
		if(A.size()>1) {
			for (int i = 0; i < A.size()-1; i++) {
				while(p1 < A.get(i).length() && p1 < A.get(i+1).length() &&  A.get(i).charAt(p1) == A.get(i+1).charAt(p1) ) {
					p1++;
					
				}
				ans = Math.min(ans, p1);
				p1=0;

			}
		}else {
			return A.get(0);
		}
		
		for (int i = 0; i < ans; i++) {
			wordans += A.get(0).charAt(i);
		}
		return wordans;
		
    }

}
