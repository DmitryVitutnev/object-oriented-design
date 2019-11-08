package graph;

import java.util.Set;

public class GraphFactory {



    public Graph generateFromCliques(int n, Set<Integer>... cliques) {
        Graph result = new Graph(n);
        for(Set<Integer> s : cliques) {
            for(Integer v1 : s) {
                for(Integer v2 : s) {
                    result.setEdge(v1, v2, true);
                }
            }
        }
        return result;
    }

}
