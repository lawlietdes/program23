package Stringss;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("b"));
	}
	 public static int lengthOfLastWord(final String A) {
	        int ans = 0;
	        boolean flag = false;
	        if (A.length() > 0 ){
	            for(int i = A.length()-1; i >= 0; i--){
	                if(A.charAt(i) != ' '){
	                    flag = true;
	                    ans++;
	                }
	                if(A.charAt(i) == ' ' && flag){
	                    break;
	                }
	            }
	        }
	        return ans;
	    }

}
