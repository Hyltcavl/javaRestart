package Omegpoint.tests;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GraphTest {

    @Test
    public void fastestRoute(){
        Graph g = new Graph();
        int[] arr1 = {0, 0, 1};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {0, 1};
        int[] arr4 = {2, 3};
        assertEquals(3, g.fastestRoute(arr1, arr2, 2, 3));
        assertEquals(-1, g.fastestRoute(arr3, arr4, 0, 1));
    }
    @Test
    public void isSolvable(){
        Graph g = new Graph();
        int[] arr1 = {0, 0, 1};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {0, 1};
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(5);
        lists.add(2);
        lists.add(1);
        lists.add(8);
        lists.add(3);
        lists.add(4);
        lists.add(1);

        //{2, 4, 6, 8, 4, 2, 12, 7, 65, 43, 5, 32532, 8765, 2, 34, 7, 8765, 11, 89, 890, 76}
        g.isSolvable(5, lists,lists );
        System.out.println( g.isSolvable(5, lists,lists));
      //  assertEquals(3, g.fastestRoute(arr1, arr2, 2, 3));
      //  assertEquals(-1, g.fastestRoute(arr3, arr4, 0, 1));
    }
}
