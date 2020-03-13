
public class Insertion {

	public static void main(String[] args) {
		int vector[]= {5,4,3,1,2};
		Insertion(vector);
	}
	
	public static int Insertion(int numeros[]) {
		int position=0;
		int numAux=0;
		int numeroCambios=0;
		for(int i=0;i<numeros.length;i++){
			position = i; 
			numAux = numeros[i];
			while((position>0) && (numeros[position] > numAux)){
				//System.out.println(pos+">0 &&"+numeros[pos-1]+">"+numAux);
				//System.out.println("remplazo/"+numeros[pos]+"/por/"+numeros[pos-1]);
	        	numeroCambios++;
				numeros[position] = numeros[position-1];
				position--;
			}
			//System.out.println("remplazo/"+numeros[pos]+"/por/"+numAux);
			if(numeros[position] != numAux)numeroCambios++;
			numeros[position] = numAux;
		}
		System.out.print(numeroCambios);
		return numeroCambios;
	}

}
