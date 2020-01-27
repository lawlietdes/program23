package arbolBinario2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		
		bt.insert(9,"Manzanas");
		bt.insert(3,"Peras");
		bt.insert(5,"Uvas");
		bt.insert(2,"Naranjas");
	        
		bt.recorrer(bt.root);
	}

}
