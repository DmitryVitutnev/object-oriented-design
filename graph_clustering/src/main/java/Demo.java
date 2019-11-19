import clusterers.*;
import graph.Graph;
import graph.GraphFactory;
import graph.GraphFunctions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException {

        List<IClusterer> clusterers = new ArrayList<IClusterer>();
        clusterers.add(new BruteClusterer());
        clusterers.add(new BBCClusterer());
        clusterers.add(new ChessClusterer());
        clusterers.add(new GreedClusterer());
        clusterers.add(new BBCLocalClusterer());
        clusterers.add(new GreedLocalClusterer());

        for(int i = 0; i < clusterers.size(); i++) {
            for(int j = i + 1; j < clusterers.size(); j++) {
                compareClusterers(clusterers.get(i), clusterers.get(j), 0.33, 60000);
            }
        }

    }

    public static void compareClusterers(IClusterer clusterer1, IClusterer clusterer2, double edgeKoef, long maxTime) throws FileNotFoundException {
        long curTime = System.currentTimeMillis();
        long endTime = curTime + maxTime;
        int i = 1;

        GraphFactory factory = new GraphFactory();
        int wins1 = 0;
        int wins2 = 0;

        String filename = "results/" + clusterer1 + "_" + clusterer2 + "_" + edgeKoef + ".txt";

        File file = new File(filename);
        PrintWriter printer = new PrintWriter(file);

        while(curTime < endTime) {
            StringBuilder sb = new StringBuilder();

            Graph graph = factory.generateRandom(i, edgeKoef, 42);
            Graph graph1 = clusterer1.handle(graph);
            Graph dGraph1 = GraphFunctions.symmetricDifference(graph, graph1);
            Graph graph2 = clusterer2.handle(graph);
            Graph dGraph2 = GraphFunctions.symmetricDifference(graph, graph2);
            sb.append("Vertex_number=").append(i).append(" Edge_number=").append(graph.countEdges())
                    .append(" ").append(clusterer1).append("_result=").append(dGraph1.countEdges())
                    .append(" ").append(clusterer2).append("_result=").append(dGraph2.countEdges());
            if (dGraph1.countEdges() < dGraph2.countEdges()) {
                wins1++;
                sb.append(" Winner=").append(clusterer1);
            } else if (dGraph1.countEdges() > dGraph2.countEdges()) {
                wins2++;
                sb.append(" Winner=").append(clusterer2);
            } else {
                sb.append(" Winner=").append("Both");
            }
            printer.println(sb.toString());
            printer.flush();

            curTime = System.currentTimeMillis();
            i++;
        }

        printer.println("" + clusterer1 + " wins = " + wins1);
        printer.println("" + clusterer2 + " wins = " + wins2);
        printer.flush();

        System.out.println("" + clusterer1 + " " + clusterer2 + " comparation finished");

    }


}
