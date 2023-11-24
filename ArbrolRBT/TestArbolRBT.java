package Tree;

public class TestArbolRBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbolRBT<Integer> arbol = new ArbolRBT<>();
	    arbol.insert(10);
	    arbol.insert(30);
	    arbol.insert(20);
	    arbol.insert(50);
	    arbol.insert(40);
	    arbol.printInOrder();
	    arbol.delete(30);
	    Nodo<Integer> nodo = arbol.search(40);
	    System.out.println(nodo != null ? "Encontrado" : "No encontrado");
	}
}
