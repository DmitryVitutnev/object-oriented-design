package graph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Graph {

    private int n;
    private boolean[][] edges;

    public Graph(int n) {
        this.n = n;
        if(n == 0) {
            return;
        }
        edges = new boolean[n][n];
    }

    public int getN() {
        return n;
    }

    public Set<Integer> getVertexSet() {
        Set<Integer> result = new HashSet<Integer>();
        for(int i = 0; i < n; i++) {
            result.add(i);
        }
        return result;
    }

    public boolean getEdge(int v1, int v2) {
        return edges[v1][v2];
    }

    public void setEdge(int v1, int v2, boolean value) {
        if(v1 == v2) {
            return;
        }
        edges[v1][v2] = value;
        edges[v2][v1] = value;
    }

    public int countEdges() {
        int result = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(edges[i][j]) {
                    result++;
                }
            }
        }
        return result;
    }

    public int getVertexDegree(int v) {
        return getVertexNeighbours(v).size();
    }

    public Set<Integer> getVertexNeighbours(int v) {
        Set<Integer> result = new HashSet<Integer>();
        for(int i = 0; i < n; i++) {
            if(edges[i][v]) {
                result.add(i);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(edges[i][j]) {
                    string.append(1);
                } else {
                    string.append(0);
                }
                string.append(" ");
            }
            string.append("\n");
        }
        return string.toString();
    }
}
