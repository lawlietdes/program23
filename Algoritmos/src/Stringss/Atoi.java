package Stringss;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(atoi("-512147"));

	}
	
	public static int atoi(final String A) {
		String A2=A.replaceAll("[^a-zA-Z0-9 ]", "");
		Map< Integer,Integer> hm = new HashMap< Integer,Integer>(); 
		hm.put(48, 0);
		hm.put(49, 1);
		hm.put(50, 2);
		hm.put(51, 3);
		hm.put(52, 4);
		hm.put(53, 5);
		hm.put(54, 6);
		hm.put(55, 7);
		hm.put(56, 8);
		hm.put(57, 9);
        long number=0;
        if(A2.length()==1) {
        	if(A.charAt(0)=='-')return hm.get((int)A2.charAt(0))*(-1);
			return hm.get((int)A2.charAt(0));
		}else {
			for (int i = 0; i < A2.length(); i++) {
				
				if(A2.charAt(i)>=48 || A2.charAt(i)<=57 ) {
					break;
				}else {
					number+=hm.get((int)A2.charAt(i));
					number*=10;
				}
			}
			
		}
        if(A.charAt(0)=='-')return ((int)number/10)*(-1);
        
        System.out.println(number);
        System.out.println("...=" + (long) number);
		return (int)(number/10);
    }

}
