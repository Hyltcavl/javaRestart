import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class KlarnaExampleTest {

    @Test
    public void fastestRoute(){
        KlarnaExample g = new KlarnaExample();
        int[] arr1 = {0, 0, 1};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {0, 1};
        int[] arr4 = {2, 3};
        int[] arr5 = {7,7,8,3,50,10,10,10,10,8,9,12,12};
        int[] arr6 = {3,8,3,14,14,9,50,14,3,9,19,19,0};
        assertEquals(3, g.fastestRoute(arr1, arr2, 2, 3));
        assertEquals(-1, g.fastestRoute(arr3, arr4, 0, 1));
        assertEquals(5, g.fastestRoute(arr5, arr6, 14, 0));
     }

}
