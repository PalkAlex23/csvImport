package modell;

public class Ember {
    private String nev, cim;

    public Ember(String nev, String cim) {
        this.nev = nev;
        this.cim = cim;
    }

    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    @Override
    public String toString() {
        return "ember{" + "nev=" + nev + ", cim=" + cim + '}';
    }
}
