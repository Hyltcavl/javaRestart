import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
import java.math.*;

/**
 *
 * @author bethan
 */

// https://www.issacc.com/relearn-java-in-few-minutes/
// Naming conventions - https://www.geeksforgeeks.org/java-naming-conventions/
// camelback writing meansWritingLikeThis
//classes start with uppercase, methods do not.
/*
Java SE
When most people think of the Java programming language, they think of the Java SE API.
Java SE's API provides the core functionality of the Java programming language.
It defines everything from the basic types and objects of the Java programming
language to high-level classes that are used for networking, security, database access,
graphical user interface (GUI) development, and XML parsing.
In addition to the core API, the Java SE platform consists of a virtual machine,
development tools, deployment technologies, and other class libraries and toolkits
commonly used in Java technology applications.
*/

/*
Java EE
The Java EE platform is built on top of the Java SE platform.
The Java EE platform provides an API and runtime environment for
developing and running large-scale, multi-tiered, scalable, reliable,
and secure network applications.
*/

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
