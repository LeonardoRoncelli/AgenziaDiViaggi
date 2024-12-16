import java.util.Queue;
import java.util.Scanner;
public class TestAgenzia {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        AgenziaViaggi funzione=new AgenziaViaggi();
        final double costoBase=200;
        int scelta;
        do{
            System.out.println("1 - Inserisci le informazioni dei pacchetti\n"+
                    "2 - Visualizza informazioni dei pacchetti inseriti\n"+
                    "3 - Visualizza costo medio dei pacchetti\n"+
                    "4 - Visualizza dati dei pacchetti con costo minimo e massimo\n"+
                    "0 - Uscita");
            System.out.print("Inserisci la tua scelta: ");
            scelta= input.nextInt();
        }while(scelta!=0);
    }
}