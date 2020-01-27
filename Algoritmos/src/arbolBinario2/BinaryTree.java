package arbolBinario2;


public class BinaryTree {
	public Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	public void insert (int key, Object value) {
		Node n = new Node(key);
		n.value = value;
		
		if(root == null) {
			root = n;
			
		}else {
			Node aux = root;
			
			while(aux != null) {
				n.father = aux;
				
				if(n.key >= aux.key) {
					aux = aux.right;
					
				}else {
					aux = aux.left;
				}
			}
			
		}
		if(n.key < n.father.key) {
			n.father.left = n;
			
		}else {
			n.father.right = n;
			
		}
		
	}
	
	 public void recorrer(Node n){
	        if (n != null) {
	            recorrer(n.left);
	            System.out.println("Indice " +n.key+" fruta " + n.value);
	            recorrer(n.right);
	        }
	 }

}
