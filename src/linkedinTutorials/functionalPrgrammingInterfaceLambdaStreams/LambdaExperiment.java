package linkedinTutorials.functionalPrgrammingInterfaceLambdaStreams;

import java.util.ArrayList;
import java.util.*;

public class LambdaExperiment {
    //Lambdas can be used in functional interfaces
    public LambdaExperiment(){
        List<Integer> items = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            items.add(i);
        }
        for(int item : items)
            System.out.println(item);

        items.forEach(System.out::println);

        items.forEach( item -> System.out.println(item*item));
        String s = "s";

    }
}
