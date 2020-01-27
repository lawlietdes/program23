package listaSimple;

public class Listaa {
	Nodo head;
	int size;
	public Listaa() {
		head = null;
		size = 0;
	}
	
	public void addNodoRight(int value) {
		if(head == null) {
			head = new Nodo(value);
			size++;
		}else {
			Nodo aux = head;
			while(aux.next != null) {
				aux = aux.getNext();
			}
			Nodo n = new Nodo(value);
			aux.next = n;
			size++;
			
		}
	}
	public boolean isEmptyy() {
		if (head == null) {
			return true;
		}
		return false;
	}
	
	public void addNodoLeft(int value) {
		if(head == null) {
			head = new Nodo(value);
			size++;
		}else {
			Nodo aux = head;
			Nodo n = new Nodo(value);
			n.next = aux;
			head = n;
			size++;
		}
	}
	
	public void getNodes() {
		Nodo n= head;
		System.out.println(n.getValue());
		while(n.next !=null) {
			n = n.getNext();
			System.out.println(n.getValue());
		}
	}
	 public void addNodo(int i, int value) {
		 Nodo aux = head;
		 
	 }
	

}
