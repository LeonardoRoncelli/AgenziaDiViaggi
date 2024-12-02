public class Agenzia {
    private String destinazione;
    private int numGiorni;
    private double prezzoBase;
    public void setDestinazione(String destinazione){
        this.destinazione=destinazione;
    }
    public String getDestinazione(){
        return destinazione;
    }
    public void setNumGiorni(int numGiorni){
        this.numGiorni=numGiorni;
    }
    public int getNumGiorni(){
        return numGiorni;
    }
    public void setPrezzoBase(double prezzoBase){
        this.prezzoBase=prezzoBase;
    }
    public double getPrezzoBase(){
        return prezzoBase;
    }
    public Agenzia(String destinazione,int numGiorni,double prezzoBase){
        this.destinazione=destinazione;
        this.numGiorni=numGiorni;
        this.prezzoBase=prezzoBase;
    }
    public Agenzia(){
        destinazione="";
        numGiorni=0;
        prezzoBase=0;
    }
    public String toString(){
        return ("Destinazione del viaggio: "+destinazione+"\n"+
                "Durata in giorni del viaggio: "+numGiorni+"\n"+
                "Prezzo base del viaggio: "+prezzoBase);
    }
    public boolean equals(Object o){
        if(o instanceof Agenzia){
            Agenzia f=(Agenzia)o;
            return this.destinazione.equalsIgnoreCase(destinazione)&&this.numGiorni==(numGiorni)&&this.prezzoBase==prezzoBase;
        }else{
            return false;
        }
    }
}