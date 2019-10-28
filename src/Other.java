import java.lang.reflect.Type;
import java.util.ArrayList;

public class Other {
    public Other(){
        int x = 5, y = 5;
        // this is called preincrement, adding the
        // 1 before x has been printed
        System.out.println(++x);
        System.out.println(x);

        // this is called postincrement, adding the
        // 1 after y has been printed
        System.out.println(y++);
        System.out.println(y);

    }


}
