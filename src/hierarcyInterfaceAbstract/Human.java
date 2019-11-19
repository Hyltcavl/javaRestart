package hierarcyInterfaceAbstract;

public abstract class Human implements InterfaceExample {

    public void eat(){
        System.out.println(this.getClass());
    }
}
