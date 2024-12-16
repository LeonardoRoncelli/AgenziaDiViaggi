public class ViaggiConEscursioni extends ViaggiConVolo{
    private int numEscursioni;
    public ViaggiConEscursioni(boolean isAndataRitorno,int numEscursioni){
        super(isAndataRitorno);
        this.numEscursioni =numEscursioni;
    }
    public void setNumEscursioni(int numEscursioni){
        this.numEscursioni=numEscursioni;
    }
    public int getNumEscursioni(){
        return numEscursioni;
    }
    public String toString(){
        return ("Numero delle escursioni: "+getNumEscursioni());
    }
}