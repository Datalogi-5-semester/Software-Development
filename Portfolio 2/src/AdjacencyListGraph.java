import java.util.ArrayList;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.PriorityQueue;

public class AdjacencyListGraph {
    private ArrayList<Vertex> vertices;

    public AdjacencyListGraph() {
        vertices = new ArrayList<Vertex>();
    }

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public void newEdge(Vertex from, Vertex to, Integer dist) {
        if (!(vertices.contains(from) && vertices.contains(to))) {
            System.out.println("Vertex not found. ");
            return;
        }
        Edge newEdge = new Edge(from, to, dist);
        Edge newEdge2 = new Edge(to, from, dist);
    }

    public void printGraph() {
        Vertex currentVertex;
        for (int i = 0; i < vertices.size(); i++) {
            currentVertex = vertices.get(i);
            System.out.println("Edges from Vertex: " + currentVertex.getName());
            for (int j = 0; j < currentVertex.getOutEdges().size(); j++) {
                Edge currentEdge = currentVertex.getOutEdges().get(j);
                System.out.println("To: " + currentEdge.getToVertex().getName() + ", Weight: " + currentEdge.getWeight());
            }
            System.out.println(" ");
        }
    }

    //minimum spanning tree prims
    public void MSTPrims() {

        PriorityQueue<Vertex> PQ = new PriorityQueue<Vertex>();

        if (vertices.size() > 0) {
            vertices.get(0).distance = 0;
            PQ.offer(vertices.get(0));
        }

        int counterPQ = 0; //Antallet af elementer i PQ
        int totalWeightMST = 0; //Samlet distance/weight af edges i MST

        while (!PQ.isEmpty() && counterPQ < vertices.size()) {

            Vertex u = PQ.poll(); //Vertex u er det nyeste tilføjet element til PQ (det øverste)

            if (!u.visited) {
                for (int i = 0; i < u.getOutEdges().size(); i++) {
                    if (u.getOutEdges().get(i).getWeight() < u.getOutEdges().get(i).getToVertex().distance) {
                        u.getOutEdges().get(i).getToVertex().distance = u.getOutEdges().get(i).getWeight();
                        u.getOutEdges().get(i).getToVertex().predecessor = u;
                        PQ.offer(u.getOutEdges().get(i).getToVertex());
                    }
                }
                u.visited = true;
                counterPQ++;
                totalWeightMST += u.distance;

            }
        }
        System.out.println(" Minimum spanning Tree Distance: " + totalWeightMST);

        printMST();

    }

    public void printMST(Vertex[] pred, Integer[] dist) {
        for (int i = 0; i < vertices.size(); i++) {
            System.out.println(i + " parent:  "  + pred[i] + " Edge Weight: " + dist[i]);
        }
    }
}
