package linkedinTutorials;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {

        List names = new ArrayList();
        names.add("kelly");
        String name = (String) names.get(0);
        System.out.println(name);
        names.add(8);

        //Safer with generics
        List<String> names2 = new ArrayList();
        names2.add("kelly");
        String name2 = names2.get(0);
        System.out.println(name2);
        //names2.add(8);
    }
}
