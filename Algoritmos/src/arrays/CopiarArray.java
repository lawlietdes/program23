package arrays;

public class CopiarArray {
	public static void main(String[] args) {
		int sequence[]= {1,2,3,4,5,6};
		int arreaux1[]=new int[sequence.length-1];
        int arreaux2[]=new int[sequence.length-1];
        int i =1;
        System.arraycopy(sequence, 0, arreaux1, 0, i);
        for (int j = 0; j < arreaux1.length; j++) {
        	System.out.println(arreaux1[j]);
		}
        System.out.println("");
        System.out.println(arreaux1.length+"_"+((sequence.length)-1)+"_"+i);
        System.arraycopy(sequence, i, arreaux1, i, (sequence.length-1)-(i));
        System.out.println("");
        for (int j = 0; j < arreaux1.length; j++) {
        	System.out.println(arreaux1[j]);
		}
	}

}
