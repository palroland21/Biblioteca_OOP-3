public class SefulBibliotecii {
    private String nume;
    private int varsta;
    private int nrDeAni;
    private String contact;
    private int aniSef;

    public SefulBibliotecii(String nume, int varsta, int nrDeAni, String contact){
        this.nume = nume;
        this.varsta = varsta;
        this.nrDeAni = nrDeAni;
        this.contact = contact;
        setAniSef();
    }
    public SefulBibliotecii(int varsta, int nrDeAni){
        this.varsta = varsta;
        this.nrDeAni = nrDeAni;
        setAniSef();
    }

    public SefulBibliotecii(){
        this("Unknown", 0, 0, "None");
    }

    public String getNume(){
        return this.nume;
    }
    public int getVarsta(){
        return this.varsta;
    }
    public int getNrDeAni(){
        return this.nrDeAni;
    }
    public String getContact(){
        return this.contact;
    }

    public void setNume(String nume){
        this.nume = nume;
    }
    public void setVarsta(int varsta){
        this.varsta = varsta;
        setAniSef();
    }
    public void setNrDeAni(int nrDeAni){
        this.nrDeAni = nrDeAni;
        setAniSef();
    }

    public void contact(String contact){
        this.contact = contact;
    }

    private void setAniSef(){
        this.aniSef = this.varsta - this.nrDeAni;
    }
    @Override
    public String toString(){
        return "Seful acestei biblioteci este " + this.nume + " cu varsta de " + this.varsta +
                ". Se afla in functia asta de " + this.nrDeAni + " ani, de la varsta de " + this.aniSef + ", iar contactul lui este: " + this.contact + ".";
    }

}
