package week13.graphs;

public class Week13Graphs {
    public static void main(String[] args) {
        // add 
        graph g = new graph();
        g.addVertex("A").addVertex("B").addVertex("C").addVertex("D").addVertex("E").addVertex("F").addVertex("S");
        
        g.addEdge("S", "A", 3);
        g.addEdge("S", "C", 2);
        g.addEdge("S", "F", 6);

        g.addEdge("C", "A", 2);
        g.addEdge("A", "B", 6);
        g.addEdge("A", "D", 1);

        g.addEdge("B", "E", 1);
        g.addEdge("C", "D", 3);

        g.addEdge("D", "E", 4);
        g.addEdge("F", "E", 2);

        g.dfs("S");
    }
    
}
