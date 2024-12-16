public class ViaggiConVolo extends Pacchetto{
    private boolean isAndataRitorno;
    public ViaggiConVolo(boolean isAndataRitorno,String destinazione,int numGiorni,double prezzoBase){
        super(destinazione,numGiorni,prezzoBase);
        this.isAndataRitorno =isAndataRitorno;
    }

    public ViaggiConVolo(boolean isAndataRitorno) {
        isAndataRitorno=false;
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