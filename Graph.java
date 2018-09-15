public class Graph {

    int numNodes;
    Node[] nodes;

    boolean adjmatrix [][] = new boolean [numNodes][numNodes];
    
    public void addEdge(int i, int j) {

    	adjmatrix[i][j] = true;
    	adjmatrix[j][i] = true;
    }

    public Graph(int num) {
	numNodes = num;
	nodes = new Node[numNodes];
	for(int i = 0; i < numNodes; i++) {
	    nodes[i] = new Node(i);
	}
   }

}