package arrays;

public class shapeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int shapeArea(int n) {
	    if (n==1){
	        return 1;
	    }else{
	        return ((int)Math.pow(n-1,2)*2)+(n+(n-1));
	    }
	    

	}

}
