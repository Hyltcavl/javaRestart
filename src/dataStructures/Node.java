package dataStructures;

import java.util.ArrayList;

public class Node {
    private int id;
    ArrayList<Node> adjacentNodes = new ArrayList<Node>();
    public Node(int id){
        this.id=id;
    }

}
