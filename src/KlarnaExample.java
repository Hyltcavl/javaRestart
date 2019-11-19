import com.sun.source.tree.UsesTree;
import dataStructures.Graph;

import javax.swing.*;
import java.util.*;

public class KlarnaExample {

    public class Node2 {
        HashSet<Node2> adjacentNodes = new HashSet<>();
        int id;
        boolean visited = false;

        public Node2(int id) {
            this.id = id;
        }

        private void addAdjacent(Node2 node) {
            adjacentNodes.add(node);
        }

        private void visited() {
            this.visited = true;
        }

        @Override
        public String toString() {
            return id + "";
        }
    }


    public int fastestRoute(int[] from, int[] to, int locationA, int locationB) {
        HashSet<Integer> allNumbers = new HashSet<>();
        ArrayList<Node2> allNodes = new ArrayList<>();

        // putting all numberNodes in a set, thus removing duplicants and getting a node count
        for (int i = 0; i <= from.length - 1; i++) {
            allNumbers.add(from[i]);
        }
        for (int i = 0; i <= to.length - 1; i++) {
            allNumbers.add(to[i]);
        }

        //creating a list with nodes from all unique numbers found in from[] and to[]
        allNumbers.forEach(integer -> allNodes.add(new Node2(integer)));

        //adding all arcs/edges connecting the nodes
        for(Node2 node : allNodes) {
            for (int i = 0; i <= from.length - 1; i++) {
                if (from[i] == node.id) {
                    for (Node2 node2 : allNodes) {
                        if (to[i] == node2.id) node.addAdjacent(node2);
                    }
                }
                if (to[i] == node.id) {
                    for (Node2 node2 : allNodes) {
                        if (from[i] == node2.id) node.addAdjacent(node2);
                    }
                }
            }
        }
            /*
        for (int i = 0; i <= from.length - 1; i++) {

            allNodes.get(from[i]).addAdjacent(allNodes.get(to[i]));

            allNodes.get(to[i]).addAdjacent(allNodes.get(from[i]));
        }*/
        //för varje nod i nodlista

        //hitta alla from[i] med samma id och lägg motsvarande to[i] som adjacent
        //vice verce

        //BFS
        Queue<Node2> queue = new LinkedList<>();
        for(Node2 n: allNodes){
            if(n.id == locationA){
                queue.add(n);
            }
        }
        Node2 destination = allNodes.get(locationB);

        //step counter
        int steps = 0;
        while (!queue.isEmpty()) {
            ////Lifo queue
            Node2 node = queue.remove();
            //mark node visited
            node.visited();
            //check if destination
            if (node.id == destination.id) return steps;
            //putt all adjacent nodes in to queue that hasn't been visited
            for (Node2 n : node.adjacentNodes) {
                if (!n.visited) queue.add(n);
            }
            steps++;
        }
        return -1;
    }

}
/*
import java.util.*;

public class Graph {
  public class Node{
    HashSet<Node> adjacentNodes = new HashSet<>();
    private int id;
    private boolean visited = false;
    Node cameFrom = null;

    public Node(int id){
      this.id = id;
    }
    public void addAdjacent(Node node){
      adjacentNodes.add(node);
    }
    public void visited(){
      this.visited = true;
    }
    public boolean isVisited(){
      return visited;
    }
    public int getId(){
      return id;
    }
    /*private HashSet getAdjacentNodes(){
      return adjacentNodes;
    }*/
/*
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
    /*
    for(int i = 0; i <= from.length-1; i++){
     allNodes.get(from[i]).addAdjacent(allNodes.get(to[i]));
     allNodes.get(to[i]).addAdjacent(allNodes.get(from[i]));
    }*/
/*
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
        for(Node n: allNodes){
        if(n.getId() == locationA){
        queue.add(n);
        }
        }
        //queue.add(allNodes.get(locationA));


        while(!queue.isEmpty()){
        Node n = queue.remove();
        if(n.getId() == locationB) return pathLength(n);

        for(Node adj : n.adjacentNodes){
        if(!adj.isVisited() || adj.cameFrom == null){
        adj.cameFrom = n;
        adj.isVisited();
        queue.add(adj);
        }
        }



        }

        return -1;
        }
private int pathLength(Node n){
        int path = 0;
        while(n.cameFrom != null){
        n = n.cameFrom;
        path++;
        }
        return path;
        }
        }
 */