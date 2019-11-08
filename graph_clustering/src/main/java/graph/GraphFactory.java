package graph;

import java.util.Random;
import java.util.Set;

public class GraphFactory {


    public Graph generateRandom(int n, int edgePlaceIterations, long seed) {
        Random random = new Random(seed);
        Graph result = new Graph(n);
        int i, j;
        for(int k = 0; k < edgePlaceIterations; k++) {
            i = (int) (random.nextDouble() * n);
            j = (int) (random.nextDouble() * n);
            result.setEdge(i, j, true);
        }
        return result;
    }

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
