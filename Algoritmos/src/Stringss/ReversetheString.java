package Stringss;

import java.util.Stack;

public class ReversetheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve("the sky is blue"));
	}
    public static String solve(String A) {
    	Stack<String> stack = new Stack<>(); 
    	int p1 = 0;
    	String word = "";
    	String ans = "";
    	
    	while(p1 < A.length()) {
    		if(A.charAt(p1) != ' ' ) {
    			word += A.charAt(p1);
    			p1++;
    			
    		}else {
    			stack.push(word);
    			stack.push(" ");
    			
    			while(A.charAt(p1) == ' ' && p1 < A.length()) {
    				p1++;
    				
    			}
    			word = "";
    		}
    	}
    	stack.push(word);
    	while(!stack.isEmpty()) {
    		ans += stack.pop();
    	}
    	
    	return ans;
    }

}
