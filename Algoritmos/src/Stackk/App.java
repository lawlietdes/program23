package Stackk;

public class App {

	public static void main(String[] args) {
		Stack pila= new Stack(3);
		/*pila.push(0);
		pila.push(1);
		pila.push(2);
		pila.getEmptyStack(pila);
		System.out.println(pila.isEmpty());
		*/
		System.out.println("------------------------------");
		int array[]= {9,8,7,6,5,4,3,2,1};
		Stack pila2=new Stack();
		//pila2=pila2.arrayToStack(array);
		//reverseStack(pila2);
		
		String phrase="anitalavalatina";
		System.out.println(reversePhrase(phrase));
	}
	public static void reverseStack(Stack pila) {
		while(!pila.isEmpty()) {
			System.out.print(pila.pop()+",");
		}
	}
	public static String reversePhrase(String phrase) {
		String respuesta="";
		Stack pila= new Stack(phrase.length());
		for(int i=0; i<phrase.length();i++) {
			pila.push(phrase.charAt(i));
		}
		while(!pila.isEmpty()) {
			respuesta=respuesta+pila.pop();
		}
		return respuesta;
	}

}
