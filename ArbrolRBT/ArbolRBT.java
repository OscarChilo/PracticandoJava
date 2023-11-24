package Tree;

class ArbolRBT<T extends Comparable<T>> {
	  private Nodo<T> NIL;
	  private Nodo<T> root;

	  public ArbolRBT() {
	    NIL = new Nodo<>(null);
	    NIL.color = Color.BLACK;
	    root = NIL;
	  }

	  public void insert(T key) {
	    Nodo<T> nodo = new Nodo<>(key);
	    insertarNodo(nodo);
	    repararInsercion(nodo);
	  }

	  private void insertarNodo(Nodo<T> nodo) {
	    Nodo<T> y = null;
	    Nodo<T> x = root;

	    while (x != NIL) {
	      y = x;
	      if (nodo.key.compareTo(x.key) < 0) {
	        x = x.left;
	      } else {
	        x = x.right;
	      }
	    }

	    nodo.parent = y;
	    if (y == null) {
	      root = nodo;
	    } else if (nodo.key.compareTo(y.key) < 0) {
	      y.left = nodo;
	    } else {
	      y.right = nodo;
	    }

	    nodo.left = NIL;
	    nodo.right = NIL;
	    nodo.color = Color.RED;
	  }

	  private void repararInsercion(Nodo<T> nodo) {
	    while (nodo.parent != null && nodo.parent.color == Color.RED) {
	      if (nodo.parent == nodo.parent.parent.left) {
	        Nodo<T> y = nodo.parent.parent.right;
	        if (y != null && y.color == Color.RED) {
	          nodo.parent.color = Color.BLACK;
	          y.color = Color.BLACK;
	          nodo.parent.parent.color = Color.RED;
	          nodo = nodo.parent.parent;
	        } else {
	          if (nodo == nodo.parent.right) {
	            nodo = nodo.parent;
	            rotacionIzquierda(nodo);
	          }
	          nodo.parent.color = Color.BLACK;
	          nodo.parent.parent.color = Color.RED;
	          rotacionDerecha(nodo.parent.parent);
	        }
	      } else {
	        Nodo<T> y = nodo.parent.parent.left;
	        if (y != null && y.color == Color.RED) {
	          nodo.parent.color = Color.BLACK;
	          y.color = Color.BLACK;
	          nodo.parent.parent.color = Color.RED;
	          nodo = nodo.parent.parent;
	        } else {
	          if (nodo == nodo.parent.left) {
	            nodo = nodo.parent;
	            rotacionDerecha(nodo);
	          }
	          nodo.parent.color = Color.BLACK;
	          nodo.parent.parent.color = Color.RED;
	          rotacionIzquierda(nodo.parent.parent);
	        }
	      }
	    }
	    root.color = Color.BLACK;
	  }

	  private void rotacionIzquierda(Nodo<T> x) {
	    Nodo<T> y = x.right;
	    x.right = y.left;
	    if (y.left != NIL) {
	      y.left.parent = x;
	    }
	    y.parent = x.parent;
	    if (x.parent == null) {
	      root = y;
	    } else if (x == x.parent.left) {
	      x.parent.left = y;
	    } else {
	      x.parent.right = y;
	    }
	    y.left = x;
	    x.parent = y;
	  }

	  private void rotacionDerecha(Nodo<T> x) {
	    Nodo<T> y = x.left;
	    x.left = y.right;
	    if (y.right != NIL) {
	      y.right.parent = x;
	    }
	    y.parent = x.parent;
	    if (x.parent == null) {
	      root = y;
	    } else if (x == x.parent.right) {
	      x.parent.right = y;
	    } else {
	      x.parent.left = y;
	    }
	    y.right = x;
	    x.parent = y;
	  }

	  public void delete(T key) {
	    Nodo<T> nodo = buscarNodo(key);
	    if (nodo != null) {
	      Nodo<T> y = nodo;
	      Nodo<T> x;
	      Color yOriginalColor = y.color;

	      if (nodo.left == NIL) {
	        x = nodo.right;
	        transplant(nodo, nodo.right);
	      } else if (nodo.right == NIL) {
	        x = nodo.left;
	        transplant(nodo, nodo.left);
	      } else {
	        y = minimo(nodo.right);
	        yOriginalColor = y.color;
	        x = y.right;
	        if (y.parent == nodo) {
	          x.parent = y;
	        } else {
	          transplant(y, y.right);
	          y.right = nodo.right;
	          y.right.parent = y;
	        }
	        transplant(nodo, y);
	        y.left = nodo.left;
	        y.left.parent = y;
	        y.color = nodo.color;
	      }

	      if (yOriginalColor == Color.BLACK) {
	        repararEliminacion(x);
	      }
	    }
	  }

	  private void repararEliminacion(Nodo<T> x) {
	    while (x != root && x.color == Color.BLACK) {
	      if (x == x.parent.left) {
	        Nodo<T> w = x.parent.right;
	        if (w.color == Color.RED) {
	          w.color = Color.BLACK;
	          x.parent.color = Color.RED;
	          rotacionIzquierda(x.parent);
	          w = x.parent.right;
	        }
	        if (w.left.color == Color.BLACK && w.right.color == Color.BLACK) {
	          w.color = Color.RED;
	          x = x.parent;
	        } else {
	          if (w.right.color == Color.BLACK) {
	            w.left.color = Color.BLACK;
	            w.color = Color.RED;
	            rotacionDerecha(w);
	            w = x.parent.right;
	          }
	          w.color = x.parent.color;
	          x.parent.color = Color.BLACK;
	          w.right.color = Color.BLACK;
	          rotacionIzquierda(x.parent);
	          x = root;
	        }
	      } else {
	        Nodo<T> w = x.parent.left;
	        if (w.color == Color.RED) {
	          w.color = Color.BLACK;
	          x.parent.color = Color.RED;
	          rotacionDerecha(x.parent);
	          w = x.parent.left;
	        }
	        if (w.right.color == Color.BLACK && w.left.color == Color.BLACK) {
	          w.color = Color.RED;
	          x = x.parent;
	        } else {
	          if (w.left.color == Color.BLACK) {
	            w.right.color = Color.BLACK;
	            w.color = Color.RED;
	            rotacionIzquierda(w);
	            w = x.parent.left;
	          }
	          w.color = x.parent.color;
	          x.parent.color = Color.BLACK;
	          w.left.color = Color.BLACK;
	          rotacionDerecha(x.parent);
	          x = root;
	        }
	      }
	    }
	    x.color = Color.BLACK;
	  }

	  private void transplant(Nodo<T> u, Nodo<T> v) {
	    if (u.parent == null) {
	      root = v;
	    } else if (u == u.parent.left) {
	      u.parent.left = v;
	    } else {
	      u.parent.right = v;
	    }
	    v.parent = u.parent;
	  }

	  public Nodo<T> search(T key) {
	    return buscarNodo(key);
	  }

	  private Nodo<T> buscarNodo(T key) {
	    Nodo<T> x = root;
	    while (x != NIL && !x.key.equals(key)) {
	      if (key.compareTo(x.key) < 0) {
	        x = x.left;
	      } else {
	        x = x.right;
	      }
	    }
	    return x != NIL ? x : null;
	  }

	  private Nodo<T> minimo(Nodo<T> nodo) {
	    while (nodo.left != NIL) {
	      nodo = nodo.left;
	    }
	    return nodo;
	  }
	  
	  private void inorder(Nodo x) {
	        if (x == null)
	            return;
	 
	        inorder(x.left);
	        System.out.print(x.key + " ");
	        inorder(x.right);
	  }
	  public void printInOrder() {
	        System.out.println("Inorder: ");
	        if (root == null)
	            System.out.println("Tree is empty");
	        else
	            inorder(root);
	        System.out.println();
	    }
	}
