import graph.*;

public class Main {

    public static void main(String[] args) {

        GraphFactory factory = new GraphFactory();
        IClusterer bbcClusterer = new BBCClusterer();
        IClusterer chessClusterer = new ChessClusterer();

        int bbcWins = 0;
        int chessWins = 0;
        for(int i = 1; i <= 10000; i++) {
            Graph graph = factory.generateRandom(100, i, 42);
            Graph bbcClusteredGraph = bbcClusterer.handle(graph);
            Graph bbcDifferenceGraph = GraphFunctions.symmetricDifference(graph, bbcClusteredGraph);
            Graph chessClusteredGraph = chessClusterer.handle(graph);
            Graph chessDifferenceGraph = GraphFunctions.symmetricDifference(graph, chessClusteredGraph);
            if(bbcDifferenceGraph.countEdges() < chessDifferenceGraph.countEdges()) {
                bbcWins++;
            }
            if(bbcDifferenceGraph.countEdges() > chessDifferenceGraph.countEdges()) {
                chessWins++;
            }
            System.out.println("Edges_number=" + graph.countEdges() + " BBC_diff=" + bbcDifferenceGraph.countEdges() + " Chess_diff=" + chessDifferenceGraph.countEdges());
        }

        System.out.println("BBC wins = " + bbcWins);
        System.out.println("Chess wins = " + chessWins);


        //System.out.println("BBC difference = " + differenceGraph.countEdges());
        /*System.out.println();
        System.out.println(graph);
        System.out.println(clusteredGraph);
        System.out.println(differenceGraph);*/

    }

}
