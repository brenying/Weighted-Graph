
package week13.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class graph {

    private static class Edge {
        String dest;
        int weight;

        Edge(String dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    private HashMap<String, List<Edge>> adjVertices;

    public graph() {
        adjVertices = new HashMap<>();
    }

    public List<Edge> getAdjVertices(String s) {
        return adjVertices.get(s);
    }

    public graph addVertex(String s) {
        adjVertices.putIfAbsent(s, new LinkedList<>());
        return this;
    }

    public graph addEdge(String v, String e, int w) {
        adjVertices.putIfAbsent(v, new LinkedList<>());
        adjVertices.putIfAbsent(e, new LinkedList<>());
        adjVertices.get(v).add(new Edge(e, w));
        return this;
    }
    public void dfs(String start) {
        HashSet<String> visited = new HashSet<>();
        System.out.print("\nDFS Order: ");
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(String current, Set<String> visited) {
        visited.add(current);
        System.out.print(current + " ");

        for (Edge edge : adjVertices.getOrDefault(current, new LinkedList<>())) {
            if (!visited.contains(edge.dest)) {
                dfsHelper(edge.dest, visited);
            }
        }
    }
}