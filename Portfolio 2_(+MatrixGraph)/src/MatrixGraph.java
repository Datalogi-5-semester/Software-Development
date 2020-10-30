import java.util.Arrays;
import java.util.PriorityQueue;

public class MatrixGraph {
    int[][] matrixEdgeGraph;
    int[][] matrixWeightGraph;

    MatrixGraph(int vertices) {
        matrixEdgeGraph = new int[vertices][vertices];
        matrixWeightGraph = new int[vertices][vertices];
    }

    public void addEdge(int from, int to, int weight) {
        matrixEdgeGraph[from][to] = 1;
        matrixWeightGraph[from][to] = weight;
    }

    public void printGraph() {
        for (int fromI = 0; fromI < matrixEdgeGraph.length; fromI++) {
            System.out.println("Edges from vertex " + fromI);
            for (int toj = 0; toj < matrixEdgeGraph.length; toj++) {
                if (matrixEdgeGraph[fromI][toj] == 1) {
                    System.out.print(" to " + toj);
                    System.out.println(" weight " + matrixWeightGraph[fromI][toj]);
                }
            }
            System.out.println(" ");
        }
    }

    //minimum spanning tree prims
    public void MSTPrims() {
        int[] distance = new int[matrixEdgeGraph.length];
        int[] predecessor = new int[matrixEdgeGraph.length];
        int[] visited = new int[matrixEdgeGraph.length];

        PriorityQueue<Pair> Q = new PriorityQueue<Pair>();

        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(predecessor, -1);
        Arrays.fill(visited, 0);

        if (matrixEdgeGraph.length > 0) {
            distance[0] = 0;
            Q.offer(new Pair(0, 0));
        }

        int counter = 0;
        int MST = 0;

        while (!Q.isEmpty() && counter < matrixEdgeGraph.length) {
            Pair u = Q.poll();
            if (visited[u.index] != 1) {
                for (int v = 0; v < matrixEdgeGraph.length; v++) {
                    if (matrixEdgeGraph[u.index][v] == 1 && matrixWeightGraph[u.index][v] < distance[v]) {
                        distance[v] = matrixWeightGraph[u.index][v];
                        predecessor[v] = u.index;
                        Q.offer(new Pair(distance[v], v));
                    }
                }

                visited[u.index] = 1;
                counter++;
                MST += distance[u.index];

            }
        }
        System.out.println(" Minimum spanning Tree Distance: " + MST);
        printMMST(predecessor, distance);
    }

    public void printMMST(int[] pred, int[] dist) {
        for (int i = 0; i < matrixEdgeGraph.length; i++) {
            System.out.println(i + " parent  " + pred[i] + " Edge Weight: " + dist[i]);
        }
    }
}

