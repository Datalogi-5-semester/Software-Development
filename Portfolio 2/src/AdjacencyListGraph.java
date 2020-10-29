import java.util.ArrayList;
import java.util.Arrays;
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

        PriorityQueue<Vertex> Q = new PriorityQueue<Vertex>();



        if (vertices.size() > 0) {
            vertices.get(0).distance = 0;
            Q.offer(vertices.get(0));
        }

        int counter = 0;
        int MST = 0;

        while (!Q.isEmpty() && counter < vertices.size()) {
            Vertex u = Q.poll();
            if (!u.visited) {
                for (int i = 0; i < u.getOutEdges().size(); i++) {
                    if (u.getOutEdges().get(i).getWeight() < u.getOutEdges().get(i).getToVertex().distance) {
                        u.getOutEdges().get(i).getToVertex().distance = u.getOutEdges().get(i).getWeight();
                        u.getOutEdges().get(i).getToVertex().predecessor = u;
                        Q.offer(u.getOutEdges().get(i).getToVertex());
                    }
                }

                u.visited = true;
                counter++;
                MST += u.distance;

            }
        }
        System.out.println(" Minimum spanning Tree Distance: " + MST);
        printMST();
    }

    public void printMST(Vertex pred, int dist) {
        for (int i = 0; i < pred.getOutEdges().size(); i++) {
            System.out.println(i + " parent  " + pred.predecessor + " Edge Weight: " + pred.distance);
        }

    }

}

