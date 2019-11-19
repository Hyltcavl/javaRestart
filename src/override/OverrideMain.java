package override;

// https://www.geeksforgeeks.org/overriding-in-java/

public class OverrideMain {
    public static void main(String[] args) {
        Child c = new Child();
        c.m();
        c.mProtected();
        c.mPublic();
        c.mFinal();

    }
}
