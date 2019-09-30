package 左神的算法课.代码.class06;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {
	public HashMap<Integer,Node> nodes;
	public HashSet<Edge> edges;

	public Graph() {
		nodes = new HashMap<>();
		edges = new HashSet<>();
	}
}
