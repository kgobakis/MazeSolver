import java.util.Vector;

public class Stack <E>{

	private Vector <E> list;
	


    public int size() {
	return list.size();
	}

    public boolean isEmpty() {
    return list.isEmpty();
    }

    public void push(E toAdd) {
	
	list.add(toAdd);
    }

    public E pop() {
	
	return list.remove(list.size() - 1);
	
    }

    public E peek() {
	return list.get(list.size()-1);
    }
    

    public void print() {
    	
	System.out.print("[");
	for(int i = list.size() - 1; i >= 0; i--) {
	    if(list.get(i) == null) continue;
	    System.out.print(list.get(i) + " ");
	}
	System.out.println("]");
    }

    public Stack() {
	list = new Vector <E> ();
    }

}