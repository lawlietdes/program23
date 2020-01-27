package ArbolBinario;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arbol arbol = new Arbol();
        
        arbol.insertar (9,"Manzanas");
        arbol.insertar(3,"Peras");
        arbol.insertar(5,"Uvas");
        arbol.insertar(2,"Naranjas");
        
        arbol.recorrer(arbol.raiz);

	}

}
