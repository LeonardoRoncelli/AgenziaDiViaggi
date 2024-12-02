public class ViaggiConVolo extends Agenzia{
    private boolean isAndataRitorno;
    public ViaggiConVolo(String destinazione,int numGiorni,double prezzoBase,boolean andataRitorno){
        super(destinazione,numGiorni,prezzoBase);
        this.isAndataRitorno =andataRitorno;
    }
    public void setAndataRitorno(boolean andataRitorno){
        this.isAndataRitorno =andataRitorno;
    }
    public boolean getAndataRitorno(){
        return isAndataRitorno;
    }
    public String getTipologiaVolo(){
        if (isAndataRitorno){
            return "Volo andata e ritorno";
        }else {
            return "Volo sola andata";
        }
    }
    public String toString(){
        return ("Tipologia del volo: "+getTipologiaVolo());
    }
}