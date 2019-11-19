import java.util.ArrayList;
import java.util.List;

public class Graph {

    public int fastestRoute(int[] from, int[] to, int locationA, int locationB) {
        /*
        int i = 0;
        int s = locationA;
        while(s != locationB){
            ArrayList<Integer>
        }
        if(from[i])
        if(from[])
        int[locationA]
*/
        return 5;
    }

    public int steps(int goal, ArrayList<Integer> history, current)

    public boolean isSolvable(int index, List<Integer> board, List<Integer> visitedIndices) {
        int lastIndex = board.size() - 1;
        if (index == lastIndex) {
            // Last index. solved
            return true;
        }

        if (index > lastIndex || index < 0 || visitedIndices.contains(index)) {
            // Outside list or previously vistied, failed to solve
            return false;
        }

        visitedIndices.add(index);
        int nextIndexForward = index + board.get(index);
        int nextIndexBackward = index - board.get(index);

        return isSolvable(nextIndexForward, board, visitedIndices)
                || isSolvable(nextIndexBackward, board, visitedIndices);
    }

        // Function to count number of steps
        // required to reach a destination

        // source -> source vertex
        // step -> value of last step taken
        // dest -> destination vertex
        static int steps(int source, int step, int dest) {
            // base cases
            if (Math.abs(source) > (dest))
                return Integer.MAX_VALUE;

            if (source == dest)
                return step;

            // at each point we can go either way

            // if we go on positive side
            int pos = steps(source + step + 1,
                    step + 1, dest);

            // if we go on negative side
            int neg = steps(source - step - 1,
                    step + 1, dest);

            // minimum of both cases
            return Math.min(pos, neg);
        }

        // Driver Code
        public static void main(String[] args) {
            int dest = 11;
            System.out.println("No. of steps required"+
                    " to reach " + dest +
                    " is " + steps(0, 0, dest));
        }
    }