package test;

public class TestRock {
    private String name;
    private boolean happy = false;

    public TestRock(String name){
        this.name = name;
    }
    public  String getName(){
        return name;
    }

    public boolean isHappy() {
        return happy;
    }
}