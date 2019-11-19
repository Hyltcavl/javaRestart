public class VarargsExperiment {

    //https://stackoverflow.com/questions/965690/java-optional-parameters
    //https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/

    public void varargs(String... s){
        for(int i = 0; i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
