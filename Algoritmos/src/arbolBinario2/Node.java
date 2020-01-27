package arbolBinario2;

public class Node {
	
	public Node father;
	public Node left;
	public Node right;
	public Object value;
	public int key;
	
	public Node(int key) {
		this.key = key;
		
        right=null;
        left=null;
        father=null;
        value=null;
	}

}
