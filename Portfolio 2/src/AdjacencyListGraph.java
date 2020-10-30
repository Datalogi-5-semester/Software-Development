import org.w3c.dom.ls.LSOutput;

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

        //MST bliver lavet når den hiver en vertex ud, da den kun hiver den ud med den korteste distance, PQ er bare en liste
        //MST bliver "lavet" via predecessor og distance, distance er kun den distance i vores MST, dvs. de elementer der bliver hevet ud
        //PQ
        int counter = 0;
        int MST = 0;

        while (!Q.isEmpty() && counter < vertices.size()) {
            Vertex u = Q.poll();
            if (!u.visited) {
                for (int i = 0; i < u.getOutEdges().size(); i++) {
                    if ((!u.getOutEdges().get(i).getToVertex().visited) && u.getOutEdges().get(i).getWeight() < u.getOutEdges().get(i).getToVertex().distance) {
                        u.getOutEdges().get(i).getToVertex().distance = u.getOutEdges().get(i).getWeight();
                        u.getOutEdges().get(i).getToVertex().predecessor = u;
                        Q.offer(u.getOutEdges().get(i).getToVertex());
                    }
                }

                u.visited = true;
                counter++;  //Counter bliver lavet for at stoppe vores while loop, da PQ har flere af de samme elementer
                MST += u.distance; //Kun distance mellem de vertices vi har hevet ud

            }
        }
        int finalPrice = MST * 100000;
        System.out.println("Maximum weight of the MST is: " + MST + "\n" +
                "The final price of the grid is: " + finalPrice + "kr \n");
    }



    public void printMST() {
        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).predecessor != null) {
                System.out.println(vertices.get(i).predecessor.getName() + " to " + vertices.get(i).getName() + " Edge Weight: " + vertices.get(i).distance +"km");
            }
        }
    }
}
