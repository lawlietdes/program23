package BSTS;

public class BST {
	Node raiz;
	
	public BST() {
		raiz=null;
	}
	
	public void recorridoInorden(Node x) {
		
		if(x != null) {
			recorridoInorden(x.izq);
			System.out.println(x.llave);
			recorridoInorden(x.der);
		}
		
	}
	public void insertar(int key, Object value) {
		Node n = new Node(key);
		n.value = value;
		
		if(raiz == null) {
			raiz = n;
		
		}else {
			Node temporal = raiz;

			while(temporal != null) {
				n.p = temporal;
				
				if(n.llave >= temporal.llave) {
					temporal = temporal.der;
				}else {
					temporal = temporal.izq;
					
				}
			}
			if(n.llave >= n.p.llave) {
				n.p.der = n;
				
			}else { 
				n.p.izq = n;
				
			}
		}
	}
	
	
	private class Node{
		public Node p;//padre
		public Node der;//
		public Node izq;//
		public int llave;//
		public Object value;//
		
		public Node(int key) {
			llave=key;
			der=null;
			izq=null;
			p=null;
			value=null;
			
			
		}
	}
	public static void main(String arg[]) {
		BST arbol= new BST();
		arbol.insertar(5, null);
		arbol.insertar(5, null);
		arbol.insertar(5, null);
		arbol.insertar(5, null);
		arbol.insertar(5, null);
		arbol.insertar(5, null);
		arbol.insertar(5, null);
	}
}
