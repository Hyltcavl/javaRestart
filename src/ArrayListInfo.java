import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.*;

public class ArrayListInfo {
    ArrayList list;

        public ArrayListInfo(){
            list = new ArrayList();
            list.add("String");
            System.out.println(list.get(0));
            list.set(0, "replacement String");
            System.out.println(list);

           //creates an error
            // list.set(3, "jump");
            // System.out.println(list);
            list.add("second");
            list.add("third");
            list.remove(1);
            System.out.println(list);

            loopThroughArraylist(list);

            // elements in an ArrayList are actually objects,
            // That's why you have to specify a wrapper class
            /*
            ArrayList<Integer> list2 = new ArrayList();
            for (int i = 10; i<list2.size();){
                list.size();
            }
             */


        }

        private void loopThroughArraylist(ArrayList list){
            System.out.println("Inside loopTroughArrayList function");
            // using traditional for loop
            for(int i = 0; i<list.size(); i++){
                System.out.println(list.get(i));
            }
            //using for-each loop
            for (Object i : list){
                System.out.println(i);
            }
        }

        public void sortArrayList(){
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            Collections.sort(cars);  // Sort cars, can sort both string and numbers
            for (String i : cars) {
                System.out.println(i);
            }
        }
}
