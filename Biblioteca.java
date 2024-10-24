
class Biblioteca {
    private String numeBiblioteca;
    private int nrCartiTotal;
    private int nrCartiImprumutate;
    private int nrCartiDisponibile;

    private SefulBibliotecii sefBiblioteca;
    private ClientFidel clientF;

    public Biblioteca(String numeBiblioteca, int nrCartiTotal, int nrCartiImprumutate, SefulBibliotecii sefBiblioteca) {
        this.numeBiblioteca = numeBiblioteca;
        this.nrCartiTotal = nrCartiTotal;
        this.nrCartiImprumutate = nrCartiImprumutate;
        setNrCartiDisponibile();
        this.sefBiblioteca = sefBiblioteca;
    }

    public Biblioteca(String numeBiblioteca, int nrCartiTotal, int nrCartiImprumutate) {
        this.numeBiblioteca = numeBiblioteca;
        this.nrCartiTotal = nrCartiTotal;
        this.nrCartiImprumutate = nrCartiImprumutate;
        setNrCartiDisponibile();
    }

    public Biblioteca(){
        this("Unknown", 0, 0);
    }

    public String getNumeBiblioteca() {
        return numeBiblioteca;
    }
    public int getNrCartiTotal() {
        return nrCartiTotal;
    }
    public int getNrCartiImprumutate() {
        return nrCartiImprumutate;
    }
    public int getNrCartiDisponibile() {
        return nrCartiDisponibile;
    }
    public SefulBibliotecii getSefBiblioteca(){
        return sefBiblioteca;
    }
    public ClientFidel getClientF(){
        return this.clientF;
    }

    public void setNumeBiblioteca(String numeBiblioteca) {
        this.numeBiblioteca = numeBiblioteca;
    }
    public void setNrCartiTotal (int nrCartiTotal){
        this.nrCartiTotal = nrCartiTotal;
        setNrCartiDisponibile();
    }
    public void setNrCartiImprumutate (int nrCartiImprumutate){
        this.nrCartiImprumutate = nrCartiImprumutate;
        setNrCartiDisponibile();
    }
    public void setSefBiblioteca(SefulBibliotecii sefBiblioteca){
        this.sefBiblioteca = sefBiblioteca;
    }
    public void setClientF(ClientFidel clientF){
        this.clientF = clientF;
    }

    private void setNrCartiDisponibile(){
        this.nrCartiDisponibile = this.nrCartiTotal - this.nrCartiImprumutate;
    }

    @Override
    public String toString(){
        return "Biblioteca " + this.numeBiblioteca + " are " + this.nrCartiTotal + " carti in total, din care " + this.nrCartiDisponibile +
                " carti disponibile!\n" + "Informatii despre sef: " + this.sefBiblioteca + "\n" + "Informatii despre client: " + this.clientF + "\n";
    }
}