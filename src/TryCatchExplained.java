import org.w3c.dom.ls.LSOutput;

public class TryCatchExplained {
    public TryCatchExplained(String s){

        try{
            Integer.parseInt(s);
            System.out.println(s + " is a valid integer number");
        }catch(NumberFormatException e){
            System.out.println(s + "is not a valid integer number");
        }finally { //this will always happen
            throw new IllegalArgumentException("U done goofed, so now this happen");
        }
    }
}
