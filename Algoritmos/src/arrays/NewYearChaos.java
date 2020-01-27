package arrays;

public class NewYearChaos {

	public static void main(String[] args) {
		int q[]= {2,1,5,3,4};
		int q2[]= {1 ,2 ,5 ,3 ,7 ,8 ,6 ,4};
		//minimumBribes(q2);
		minimumBribes2(q2);
		
	}
	
	public static void minimumBribes(int[] q) {
		int counter=0;
		for (int i = 0; i < q.length; i++) {
			if(q[i]!=(i+1)) {
				if( ((i+1)<q.length) && (q[i+1]==(i+1)) ) {
					counter++;
					swapping(q, i, i+1);
				}else if( ((i+2)<q.length) && q[i+2]==(i+1) ) {
					counter+=2;
					swapping(q, i, i+1);
					swapping(q, i+1, i+2);
				}else {
					System.out.println("Too chaotic");
					return;
				}
			}
		}
		System.out.println(counter);
    }
	
	public static void minimumBribes2(int[] q) {
		int counter=0;
		for (int i = q.length-1; i >=0; i--) {
			if(q[i]!=(i+1)) {
				
				if( ((i-1)>=0) && (q[i-1]==(i+1)) ) {
					counter++;
					swapping(q, i, i-1);
				}else if( ((i-2)>=0) && q[i-2]==(i+1) ) {
					counter+=2;
					swapping(q, i-2, i-1);
					swapping(q, i-1, i);
				}else {
					System.out.println("Too chaotic");
					return;
				}
			}
		}
		System.out.println(counter);
		
		
    }
	
	
	public static void swapping(int q[], int origen,int destino) {
		int aux=0;
		aux=q[origen];
		q[origen]=q[destino];
		q[destino]=aux;
	}
}
