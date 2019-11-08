import graph.BBCClusterer;
import graph.Graph;
import graph.IClusterer;

public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph(4);

        graph.setEdge(0, 1, true);
        graph.setEdge(1, 2, true);
        graph.setEdge(2, 3, true);

        IClusterer clusterer = new BBCClusterer();

        System.out.println(graph);
        System.out.println();
        System.out.println(clusterer.handle(graph));

    }

}
