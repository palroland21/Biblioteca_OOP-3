public class ClientFidel {
    private String nume;
    private int nrCartiImprumutate;
    private char grade;

    public ClientFidel(String nume, int nrCartiImprumutate){
        this.nume = nume;
        this.nrCartiImprumutate = nrCartiImprumutate;
        setGrade();
    }

    public ClientFidel(){
        this("NONE", 0);
    }

    public String getNume(){
        return this.nume;
    }
    public int getNrCartiImprumutate(){
        return this.nrCartiImprumutate;
    }

    public void setNume(){
        this.nume = nume;
    }
    public void setNrCartiImprumutate(){
        this.nrCartiImprumutate = nrCartiImprumutate;
        setGrade();
    }

    private void setGrade(){
        if(this.nrCartiImprumutate > 1 && this.nrCartiImprumutate <= 10)
            this.grade = 'B';
        else if(this.nrCartiImprumutate > 10)
            this.grade = 'A';
        else
            this.grade = 'X';
    }

    @Override
    public String toString(){
        return "Clientul fidel al bibliotecii este " + this.nume + " avand un tatal de " + this.nrCartiImprumutate + " carti imprumutate. " +
                "Astfel are gradul " + this.grade + ".";
    }

}
