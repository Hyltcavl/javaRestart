package dataStructures;

import java.util.*;

/** https://www.youtube.com/watch?v=1n5XPFcvxds
 *  https://www.youtube.com/watch?v=zaBhtODEL0w
 */

public class Graph {
    private HashMap<Integer, Node> nodeLookup = new HashMap<>();

    public static class Node{
        private int id;
        ArrayList<Node> adjacentNodes = new ArrayList<Node>();
        private Node(int id){
            this.id=id;
        }
    }

    /*
        static class Graph2{
            int V;
            LinkedList<Integer> adjListArray[];

            public Graph2(int V){
                this.V = V;

                //The size of the array is the number of nodes (vertex's)
                adjListArray = new LinkedList[V];
                for(int i = 0; i < V ; i++){
                    adjListArray[i] = new LinkedList<>();
                }
            }

            // Adds an edge(arch) to an undirected graph
            static void addEdge(Graph2 graph2, int src, int dest){
                // Add an edge from src to dest.
                graph2.adjListArray[src].add(dest);

                // Since graph is undirected, add an edge from dest
                // to src also
                graph2.adjListArray[dest].add(src);
            }

            static void printGraph(Graph2 graph){
                for(int v = 0; v < graph.V; v++)
                {
                    System.out.println("Adjacency list of vertex "+ v);
                    System.out.print("head");
                    for(Integer pCrawl: graph.adjListArray[v]){
                        System.out.print(" -> "+pCrawl);
                    }
                    System.out.println("\n");
                }
            }



        }
    */

    private Node getNode(int id){
        return nodeLookup.get(id);
    }
    public void addEdge(int source, int destination){

    }
    public boolean hasPathDFS(int source, int destinaiton){
    Node s = getNode(source);
    Node d = getNode(destinaiton);
    HashSet<Integer> visited = new HashSet<>();
    return hasPathDFS(s, d, visited);
    }
    private boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited){
        if(visited.contains(source.id)) return false;
        visited.add(source.id);
        if(source==destination) return true;
        for (Node adjacentNode : source.adjacentNodes){
            if(hasPathDFS(adjacentNode, destination, visited)){
                return true;
            }
        }
        return false;
    }
    public boolean hasPathBFS(int source, int destination){
        return hasPathBFS(getNode(source), getNode(destination));
    }
    private boolean hasPathBFS(Node source, Node destination){
        LinkedList<Node> nextToVisit = new LinkedList<Node>();
        HashSet<Integer> visited = new HashSet<>();
        nextToVisit.add(source);
        while(!nextToVisit.isEmpty()){
            Node node = nextToVisit.remove();
            if(node == destination) return true;
            if(visited.contains(node.id)) continue;
            visited.add(node.id);
            for(Node adjacentNode : node.adjacentNodes){
                nextToVisit.add(adjacentNode);
            }
        }
        return false;
    }

    public static void main(String[] args) {

    /*
        int V = 5;
        Graph2 graph = new Graph2(V);
        graph.addEdge(graph, 0, 1);
        graph.addEdge(graph, 0, 4);
        graph.addEdge(graph, 1, 2);
        graph.addEdge(graph, 1, 3);
        graph.addEdge(graph, 1, 4);
        graph.addEdge(graph, 2, 3);
        graph.addEdge(graph, 3, 4);

        // print the adjacency list representation of
        // the above graph
        graph.printGraph(graph);
    }
     */
    }
}
