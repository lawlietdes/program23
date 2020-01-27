package Queuee;

public class Queue {
	
	public static void main(String arg[]) {
		double x=0.1;
		System.out.println(Math.round(x));
		System.out.println(Math.ceil(x));
		
		System.out.println(Math.rint(x));
		System.out.println(Math.floor(x));
		int arreglo[]= {7,1,3,2,4,5,6};
		int arreglo2[]= {2,3,4,1,6,5};
		System.out.println("aqui "+minimumSwaps(arreglo));
		System.out.println("aqui "+minimumSwaps(arreglo2));
	}
	
	static int minimumSwaps(int[] arr) {
        int countswaps=0;
        int iterator=0;
        int arraux[]=new int [arr.length];
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=i+1){
                iterator=i+1;
                while(iterator<arr.length){
                    if(arr[iterator]==i+1){
                    	countswaps++;
                        swapingArr(arr,i,iterator);
                        break;
                    }
                    iterator++;
                }
            }
        }
        return countswaps;
    }
    static void swapingArr(int arr[],int origin,int destination){
        int numaux=arr[origin];
        arr[origin]=arr[destination];
        arr[destination]=numaux;
    }
}
