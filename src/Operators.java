public class Operators {
    //from -> https://www.geeksforgeeks.org/operators-in-java/

    public void ternaryOperatorExample(){

        // lowest of three numbers
        int a = 9, b = 2, c = 3, result;

        result = ((a<b) ? (a<c) ? a : c : (b<c) ? b : c);
        System.out.println(result);
    }

    public void modulusOperatorExample(){
        // from -> http://www.cafeaulait.org/course/week2/15.html
        //Divedes a number and returns the modulus, what is left after devision.
        //If any number is positive, the modulus is positive.

        int a = -3, b = -10, result;
        result = b % a;

        System.out.println(result);
    }
}
