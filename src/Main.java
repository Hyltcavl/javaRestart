import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args){


    }
    public static int getRandomNumberInRange(int max, int min) { //This function can
                                                                // be called without creating an object of AClass
        // link to java random resources https://www.mkyong.com/java/java-generate-random-integers-in-a-range/
        if (max <= min) {
            throw new IllegalArgumentException("mas must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max-min)+1)+min;

    }


    private class AClass{  //inner classes can be private, outer once can't.
        //These variables are attributes, these should always be private
        private int x;
        private String s;
        private final boolean alwaysTrue = true; //with the final modifyer, the variable is immutable
        //end of variables
        public AClass(){
            //this is the constructor of the class, code that is executed when an
            //object of the class is made/initialized, the constructor is a special method.
        }

    }

    private class ASecoundClass{

    }

}
