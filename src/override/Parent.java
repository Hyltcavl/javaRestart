package override;

public class Parent {

    void m(){
        System.out.println("parent m");
    }

    private void mPrivate(){
        System.out.println("parent mPrivate");
    }

    public void mPublic(){
        System.out.println("parent mPublic");
    }

    protected void mProtected(){
        System.out.println("parent mProtected");
    }

    final void mFinal(){
        System.out.println("parent mFinal");
    }

    static void mStatic(){
        System.out.println("parent mStatic");
    }

}
