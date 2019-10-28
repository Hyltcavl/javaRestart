public class Variables {

    //Different kinds of variables
    int data = 50; //instance variable
    static int data2 = 100; //static variable
    void method(){
        int data3 = 150; //local variable
    }


    public Variables() {



        //How Casting Works


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

        // Wrapper classes
    }
}
