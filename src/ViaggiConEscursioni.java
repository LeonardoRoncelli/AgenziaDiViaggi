public class ViaggiConEscursioni extends Agenzia{
    private int numEscursioni;
    public ViaggiConEscursioni(String destinazione,int numGiorni,double prezzoBase,int numEscursioni){
        super(destinazione,numGiorni,prezzoBase);
        this.numEscursioni =numEscursioni;
    }
    public void setNumEscursioni(int numEscursioni){
        this.numEscursioni=numEscursioni;
    }
    public int getNumEscursioni(){
        return numEscursioni;
    }
    public String toString(){
        return ("Numero delle escursini: "+getNumEscursioni());
    }
}