import graph.*;

public class Main {

    public static void main(String[] args) {

        GraphFactory factory = new GraphFactory();
        IClusterer clusterer1 = new BBCClusterer();
        IClusterer clusterer2 = new GreedClusterer();

        int wins1 = 0;
        int wins2 = 0;
        for(int i = 0; i < 10; i++) {
            Graph graph = factory.generateRandom(400, 0.3, 31 * i);
            Graph bbcClusteredGraph = clusterer1.handle(graph);
            Graph bbcDifferenceGraph = GraphFunctions.symmetricDifference(graph, bbcClusteredGraph);
            Graph chessClusteredGraph = clusterer2.handle(graph);
            Graph chessDifferenceGraph = GraphFunctions.symmetricDifference(graph, chessClusteredGraph);
            if(bbcDifferenceGraph.countEdges() < chessDifferenceGraph.countEdges()) {
                wins1++;
            }
            if(bbcDifferenceGraph.countEdges() > chessDifferenceGraph.countEdges()) {
                wins2++;
            }
            System.out.println("Edges_number=" + graph.countEdges() + " " + clusterer1 + "_diff=" + bbcDifferenceGraph.countEdges() + " " + clusterer2 + "_diff=" + chessDifferenceGraph.countEdges()
                    + " Efficiency=" + bbcDifferenceGraph.countEdges() * 1.0 / chessDifferenceGraph.countEdges());
        }

        System.out.println("" + clusterer1 + " wins = " + wins1);
        System.out.println("" + clusterer2 + " wins = " + wins2);


        //System.out.println("BBC difference = " + differenceGraph.countEdges());
        /*System.out.println();
        System.out.println(graph);
        System.out.println(clusteredGraph);
        System.out.println(differenceGraph);*/

    }

}
