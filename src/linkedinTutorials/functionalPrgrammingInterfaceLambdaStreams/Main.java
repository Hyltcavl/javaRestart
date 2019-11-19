package linkedinTutorials.functionalPrgrammingInterfaceLambdaStreams;

public class Main {
    public static void main(String[] args) {

        //with functional interface
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.greet("Teodor");

        //with lambda
        GreetingMessage gm2 = name -> System.out.println("hello " + name);
        gm2.greet("Treodor");

        //lambda without parameter
        PrintMessage pm = () -> System.out.println("message");
        pm.printMessage();
    }
}
