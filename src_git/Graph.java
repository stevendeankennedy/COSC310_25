
/**
 * Class implementation of a Graph and searches.
 * 
 * Special thanks to William, Michael, Aom, et al
 */
public class Graph {

	public static void main(String[] args) {
		Graph G = new Graph(5,5);
		
		/* First example */
		G.addEdge(0, 1);
		G.addEdge(0, 2);
		G.addEdge(1, 0);
		G.addEdge(1, 2);
		G.addEdge(1, 3);
		G.addEdge(2, 0);
		G.addEdge(2, 1);
		G.addEdge(2, 3);
		G.addEdge(2, 4);
		G.addEdge(3, 1);
		G.addEdge(3, 2);
		G.addEdge(3, 4);
		G.addEdge(4, 2);
		G.addEdge(4, 3);
		
//		/* Second example graph */
//		G.addEdge(0, 2);
//		G.addEdge(0, 4);
//		G.addEdge(1, 2);
//		G.addEdge(2, 3);
//		G.addEdge(4, 0);
		
		G.dfs();
	}

	/** The graph, implemented as a 2D matrix */
	private int[][] g;
	private int[] visited;
	
	
	/**
	 * Constructor, makes a matrix of adjacent vertices
	 * @param xLen width
	 * @param yLen height
	 */
	public Graph(int xLen, int yLen) {
		g = new int[xLen][yLen];
		visited = new int[xLen];
	}
	
	/**
	 * Add an edge to the graph
	 * @param x pos
	 * @param y pos
	 */
	public void addEdge(int x, int y) {
		g[x][y] = 1;
		g[y][x] = 1; // it is non-directed, so both ways are good
	}
	
	public void dfs() {
		visited = new int[g.length];  // sloppy but fast to code...
		dfsTraversal(0); // call this, we'll need to add args...
	}
	
	/**
	 * Perform a traversal on the graph, DFS style
	 */
	private void dfsTraversal(int y) { // TODO: what params???
		// visit vertex
		visited[y] = 1;
		// consider all adjacent vertices
		for (int i = 0;i < visited.length;i++) {
			// has it been visited?
			if (visited[i] != 1 && g[y][i] == 1/*edge exists*/) {
				// if NOT, then
				//	visit it (maybe dfs(that vertex))
				dfsTraversal(i);
				// otherwise
				//	check next vertex
			}
		}
		System.out.println(y);
		// all done, return!
	}
}
