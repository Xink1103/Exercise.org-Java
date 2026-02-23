import java.util.*;

public class Graph {

    private Collection<Node> nodesCollection;
    private Collection<Edge> edgesCollection;
    private Map<String,String> attributesMap;
    
    public Graph() {
        nodesCollection = new ArrayList<>();
        edgesCollection = new ArrayList<>();
        attributesMap = new HashMap<>();
    }

    public Graph(Map<String, String> attributes) {
        this();
        attributesMap = attributes;
    }

    public Collection<Node> getNodes() {
        return nodesCollection;
    }

    public Collection<Edge> getEdges() {
        return edgesCollection;
    }

    public Graph node(String name) {
        node(name,Collections.emptyMap());
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        Node inputNode = new Node(name,attributes);
        nodesCollection.add(inputNode);
        return this;
    }

    public Graph edge(String start, String end) {
        edge(start,end,Collections.emptyMap());
        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        Edge inputEdge = new Edge(start,end,attributes);
        edgesCollection.add(inputEdge);
        return this;
    }

    public Map<String, String> getAttributes() {
        return attributesMap;
    }
}
