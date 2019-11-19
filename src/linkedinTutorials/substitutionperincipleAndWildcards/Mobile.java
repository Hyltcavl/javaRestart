package linkedinTutorials.substitutionperincipleAndWildcards;

public class Mobile extends Device {
    public int nr = 19;

    @Override
    public String toString() {
        return ("Mobile");
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

}
