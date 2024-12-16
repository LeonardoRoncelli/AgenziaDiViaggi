public class ViaggiConPasti extends Pacchetto {
    private boolean isPensioneCompleta;
    public ViaggiConPasti(String destinazione,int numGiorni,double prezzoBase,boolean isPensioneCompleta){
        super(destinazione,numGiorni,prezzoBase);
        this.isPensioneCompleta =isPensioneCompleta;
    }
    public void setPensioneCompleta(boolean isPensioneCompleta){
        this.isPensioneCompleta=isPensioneCompleta;
    }
    public boolean getPensioneCompleta(){
        return isPensioneCompleta;
    }
    public String getTipologiaPasti(){
        if (isPensioneCompleta){
            return "Pensione completa";
        }else {
            return "Mezza pensione";
        }
    }
    public String toString(){
        return ("Tipologia dei pasti: "+getTipologiaPasti());
    }
}
