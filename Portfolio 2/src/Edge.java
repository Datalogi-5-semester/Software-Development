public class Edge {
    private Vertex fromVertex;
    private Vertex toVertex;
    private Integer weight;

    public Vertex getFromVertex() {
        return fromVertex;
    }

    public void setFromVertex(Vertex fromVertex) {
        this.fromVertex = fromVertex;
    }

    public Vertex getToVertex() {
        return toVertex;
    }

    public void setToVertex(Vertex toVertex) {
        this.toVertex = toVertex;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Edge(Vertex from, Vertex to, Integer cost) {
        fromVertex = from;
        toVertex = to;
        weight = cost;
        from.addOutEdge(this);
    }
}

