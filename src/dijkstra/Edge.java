package dijkstra;

public class Edge {
	// Each Edge will have an id.
	final private String id;
	// The Edge class's starting vertex, 
	final private Vertex source;
	// The Edge class's ending vertex. 
	final private Vertex destination;
	// Therefore, we will now have a starting vertex (source) and an ending vertex (destination),
	// each Edge will also have a certain value (a cost associated with it),
	// and we will store that in the weight variable
	final private int weight;

	public Edge(String id, Vertex source, Vertex destination, int weight) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}

	public String getId() {
		return id;
	}

	public Vertex getSource() {
		return source;
	}

	public Vertex getDestination() {
		return destination;
	}

	public int getWeight() {
		return weight;
	}

	//@Override
	public String toString() {
		return source + " " + destination;
	}

	
}
