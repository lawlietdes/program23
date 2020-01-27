package listaSimple;

public class Nodo {
	public int value;
	public Nodo next;
	//private 
	
	public Nodo(int value) {
		this.value = value;
		this.next = null;
	}
	
	public void linkNode(Nodo n) {
		next = n;
	}
	
	public Nodo getNext() {
		return next;
	}
	
	public int getValue() {
		return value;
	}

}
