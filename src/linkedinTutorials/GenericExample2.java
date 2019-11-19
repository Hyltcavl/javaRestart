package linkedinTutorials;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/*
this could be done without the generic type T but, T is safer since it offers
compile and runtime errors if objects of the wrong type would be put in to a list
this is flexible code but it shows when there is an error.
 */

public class GenericExample2 {
    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

   // InputStream

    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        //List<String> intList2 = arrayToList(intArray, new ArrayList<>());
    }

}
