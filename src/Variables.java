import jdk.swing.interop.SwingInterOpUtils;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;


public class Variables {

    //Different kinds of variables
    int data = 50; //instance variable
    static int data2 = 100; //static variable
    void method(){
        int data3 = 150; //local variable
    }


    public Variables() {

    }

    public void castingVariables(){
        byte b = 100;
        short s = (short)b;
        int i = (int)s;

        double d = 1.1;
        float f = (float)d;
        long l = (long)f;

        System.out.println("byte " + b);
        System.out.println("short " + s);
        System.out.println("int " + i);
        System.out.println("double " + d);
        System.out.println("float " + f);
        System.out.println("l " + l);
    }

    public void stringExperiments(String s){
        int sLength = s.length();
        String uppercase = s.toUpperCase();
        String substring = s.substring(1,2);
        char c = s.charAt(0);
        boolean b = s.equals("hello world");
        boolean b2 = s.equalsIgnoreCase("hello world");
        String[] split = s.split(" ");

        //print streams needs to be imported
        System.out.format("the length of %s is %d, uppercase %s, substring %s" +
                ", first char %c, is equal %b, is equal2 %b, in array " + Arrays.toString(split),
                s, sLength, uppercase, substring, c, b, b2);
    }

    //There are 3 types of variables, local, instance and static.
    // A local variable can't be static.
    // Instance variables are made inside a class as is specific to that class.
    // Static variables is a single copy.
    public class dataClass{
        // Primitive data types
        //byte, 8bit
        byte maxByte = 127;
        byte minByte = -128;
        //short, 16bit
        short maxShort = 32767;
        short minShort = -32768;
        // int, 32bit,
        int maxNum = 2147483647;
        int minNum = -2147483648;
        // long, 64bit
        long maxLong = +9223372036854775807L;
        long minLong = -9223372036854775808L;
        //char, 16bit, unsigned?
        char charMax = 65535;
        char minChar = 0;
        //Double, 8 bytes,


        // Wrapper classes
    }

}
