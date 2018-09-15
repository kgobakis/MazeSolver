import java.util.LinkedList;

//Node is the Cell in the maze!!!
public class Node {

    int index;

    // to help you keep track of things as you're solving the maze
    boolean visited = false;
    boolean inSolution = false;

    static final String PATH = "X";
    static final String VISIT = ".";
    static final String NOT_VISIT = " ";

    public String toString() {
	if(visited) {
	    if(inSolution) return PATH;
	    else return VISIT;
	}
	else return NOT_VISIT;
  }

    public Node(int i) {
	index = i;
    }

}