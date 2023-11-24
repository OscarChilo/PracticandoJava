package Tree;

enum Color {
	  RED,
	  BLACK
	}

class Nodo<T extends Comparable<T>> {
	  T key;
	  Nodo<T> parent;
	  Nodo<T> left;
	  Nodo<T> right;
	  Color color;

	  public Nodo(T key) {
	    this.key = key;
	    color = Color.RED;
	    parent = null;
	    left = null;
	    right = null;
	 }
}
	