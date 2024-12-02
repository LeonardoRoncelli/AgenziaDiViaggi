public class ViaggiConVolo extends Agenzia{
    private boolean andataRitorno;
    public ViaggiConVolo(String destinazione,int numGiorni,double prezzoBase,boolean andataRitorno){
        super(destinazione,numGiorni,prezzoBase);
        this.andataRitorno=andataRitorno;
    }
    public void setAndataRitorno(boolean andataRitorno){
        this.andataRitorno=andataRitorno;
    }
    public boolean getAndataRitorno(){
        return andataRitorno;
    }
    public String getTipologiaVolo(){
        if (andataRitorno){
            return "Volo andata e ritorno";
        }else {
            return "Volo sola andata";
        }
    }
}