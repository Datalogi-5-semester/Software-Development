import java.util.ArrayList;

public class Vertex implements Comparable<Vertex> { //so we can sort them, we will need them to make lists when we use priority queue
    private String name;
    private ArrayList<Edge> outEdges;
    Integer distance = Integer.MAX_VALUE;
    Vertex predecessor = null;
    Boolean visited = false;

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Edge> getOutEdges() {
        return outEdges;
    }

    public void setOutEdges(ArrayList<Edge> outEdges) {
        this.outEdges = outEdges;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Vertex(String id) {
        this.name = id;
        outEdges = new ArrayList<>();
    }

    public void addOutEdge(Edge outEdge) {
        outEdges.add(outEdge);
    }


    @Override
    public int compareTo(Vertex o) {
        if (this.distance < o.distance)
            return -1;
        if (this.distance > o.distance)
            return 1;
        return 0;
    }
}

