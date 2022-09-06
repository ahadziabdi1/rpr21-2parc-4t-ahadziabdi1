package ba.unsa.etf.rpr;

public class Grad {
    private int id;
    private String naziv;
    private int brojStanovnika;
    private boolean kraljevski;
    private Drzava drzava;

    public Grad(int id, String naziv, int brojStanovnika, Drzava drzava, boolean kraljevski) {
        if(!drzava.isKraljevska() && kraljevski == true) {
            throw new NotAKingdomException("Država " + drzava.getNaziv() + " nije kraljevska država");
        }
        this.id = id;
        this.naziv = naziv;
        this.brojStanovnika = brojStanovnika;
        this.drzava = drzava;
        this.kraljevski = kraljevski;
    }

    public boolean isKraljevski() {
        return kraljevski;
    }

    public void setKraljevski(boolean kraljevski) {
        if(drzava == null) throw new NotAKingdomException("Država null nije kraljevska država");
        if(!drzava.isKraljevska() && kraljevski == true) throw new NotAKingdomException("Država " + drzava.getNaziv() + " nije kraljevska država");
        this.kraljevski = kraljevski;
    }

    public Grad(int id, String naziv, int brojStanovnika, Drzava drzava) {
        this.id = id;
        this.naziv = naziv;
        this.brojStanovnika = brojStanovnika;
        this.drzava = drzava;
    }

    public Grad() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public Drzava getDrzava() {
        return drzava;
    }

    public void setDrzava(Drzava drzava) {
        this.drzava = drzava;
    }

    @Override
    public String toString() { return naziv; }
}
