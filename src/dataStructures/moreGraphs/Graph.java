package dataStructures.moreGraphs;

import java.util.*;

public class Graph {

    public class Node{
        private HashSet<Node> adjacentNodes = new HashSet<>();
        private int id;
        private Node cameFrom = null;
        public Node(int id){
            this.id = id;
        }
        public Node getCameFrom(){
            return cameFrom;
        }
        public Node setCameFrom(Node cameFrom){
            this.cameFrom = cameFrom;
        }
        public void addAdjacent(Node node){
            adjacentNodes.add(node);
        }
        public int getId(){
            return id;
        }
        public HashSet<Node> getAdjacentNodes(){
            return adjacentNodes;
        }
        @Override
        public String toString() {
            return id + "";
        }
    }

    public int fastestRoute(int[] from, int[] to, int locationA, int locationB) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        ArrayList<Node> allNodes = new ArrayList<>();

        //put all numbers from int[] to uniqueNumbers to find all nodes/vertex
        for(int i = 0; i <= from.length-1; i++){
            uniqueNumbers.add(from[i]);
            uniqueNumbers.add(to[i]);
        }

        //create all nodes and put them in a list
        uniqueNumbers.forEach(integer -> allNodes.add(new Node(integer)));

        //add all adjacentNodes to the nodes in the list
        for(Node node : allNodes) {
            for (int i = 0; i <= from.length - 1; i++) {
                if (from[i] == node.getId()) {
                    for (Node node2 : allNodes) {
                        if (to[i] == node2.getId()) node.addAdjacent(node2);
                    }
                }
                if (to[i] == node.getId()) {
                    for (Node node2 : allNodes) {
                        if (from[i] == node2.getId()) node.addAdjacent(node2);
                    }
                }
            }
        }

        Queue<Node> queue = new LinkedList<>();
        Node start = null;
        for(Node n: allNodes){
            if(n.getId() == locationA){
                start = n;
            }
        }

        queue.add(start);

        while(!queue.isEmpty()){
            Node n = queue.remove();
            if(n.getId() == locationB) return pathLength(n);
            for(Node adj : n.getAdjacentNodes()){
                if(adj.getCameFrom() == null && adj != start){
                    adj.setCameFrom(n);
                    queue.add(adj);
                }
            }
        }

        return -1;
    }

    private int pathLength(Node n){
        int path = 0;
        while(n.getCameFrom() != null){
            n = n.getCameFrom();
            path++;
        }
        return path;
    }
}

/* package dataStructures.moreGraphs;

// Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s.
import java.io.*;
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class Graph
{
    private int V; // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists

    // Constructor
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    void BFS(int s)
    {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);

        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // Driver method to
    public static void main(String args[])
    {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        /*g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);*/

/*
        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);
    }
}*/
// This code is contributed by Aakash Hasija
/*
import java.util.*;

public class Graph {

  private ArrayList<Node> allNodes;

  public int fastestRoute(int[] from, int[] to, int locationA, int locationB) {

    createGraph(from, to);


    Queue<Node> queue = new LinkedList<>();
    Node start = null;

    for(Node n: allNodes){
      if(n.getId() == locationA) start = n;
      }

    queue.add(start);
    //Start BFS
    while(!queue.isEmpty()){
      Node n = queue.remove();
      if(n.getId() == locationB) return pathLength(n);
      for(Node adj : n.getAdjacentNodes()){
        if(adj.getCameFrom() == null && adj != start){
          adj.setCameFrom(n);
          queue.add(adj);
         }
      }
    }
    return -1;
  }

  private int pathLength(Node n){
    int path = 0;
    while(n.getCameFrom() != null){
      n = n.getCameFrom();
      path++;
    }
    return path;
  }

   //put all numbers from int[] to uniqueNumbers to find all nodes/vertex
  private HashSet<Integer> findAllNodes(int[] from, int[] to){
      HashSet<Integer> uniqueNumbers = new HashSet<>();
      for(int i = 0; i <= from.length-1; i++){
        uniqueNumbers.add(from[i]);
        uniqueNumbers.add(to[i]);
      }
    return uniqueNumbers;
  }

  private void createGraph(int[] from, int[] to){
    HashSet<Integer> uniqueNumbers = findAllNodes(from, to);
    ArrayList<Node> allNodes = new ArrayList<>();
    createNodes(uniqueNumbers);
    addArcs(from,to);
  }

   //create all nodes and put them in a list
  private void createNodes(HashSet<Integer> nodesWithId){
    allNodes = new ArrayList<>();
    nodesWithId.forEach(integer -> allNodes.add(new Node(integer)));
  }

  //add all adjacentNodes to the nodes in the list
  private void addArcs(int[] from, int[] to){
    for(Node node : allNodes) {
            for (int i = 0; i <= from.length - 1; i++) {
                if (from[i] == node.getId()) {
                    for (Node node2 : allNodes) {
                        if (to[i] == node2.getId()) node.addAdjacent(node2);
                    }
                }
                if (to[i] == node.getId()) {
                    for (Node node2 : allNodes) {
                        if (from[i] == node2.getId()) node.addAdjacent(node2);
                    }
                }
            }
        }
  }

    /**
    *Node class
    */
/*
public class Node{
    private HashSet<Node> adjacentNodes = new HashSet<>();
    private int id;
    private Node cameFrom = null;
    public Node(int id){
        this.id = id;
    }
    public Node getCameFrom(){
        return cameFrom;
    }
    public void setCameFrom(Node cameFrom){
        this.cameFrom = cameFrom;
    }
    public void addAdjacent(Node node){
        adjacentNodes.add(node);
    }
    public int getId(){
        return id;
    }
    public HashSet<Node> getAdjacentNodes(){
        return adjacentNodes;
    }
    @Override
    public String toString() {
        return id + "";
    }
}
}
 */