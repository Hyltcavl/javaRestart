package override;

public class Child extends Parent {

    @Override
    void m(){
        System.out.println("child m");
    }
    @Override
    public void mPublic(){
        System.out.println("child mPublic");
    }
    @Override
    protected void mProtected(){
        System.out.println("child mProtected");
    }

    /* Final, static and private methods can't be overritten
    @Override
    final void mFinal(){
        System.out.println("child mFinal");
    }

    @Override
    private void mPrivate(){
        System.out.println("child mPrivate");
    }

    @Override
    static void mStatic(){
        System.out.println("child mStatic");
    }
    */
}
