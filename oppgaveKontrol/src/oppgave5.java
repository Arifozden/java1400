public class oppgave5 {
    public static void main(String[] args) {
        String maned = null;
        if (maned.equals("juni")||maned.equals("juli")||maned.equals("august")){
            System.out.println("Sesong : Sommer");
        }
        else if (maned.equals("september")||maned.equals("oktober")||maned.equals("november")){
            System.out.println("Sesong : Høst");
        }
        else if (maned.equals("desember")||maned.equals("januar")||maned.equals("februar")){
            System.out.println("Sesong : Vinter");
        }
        else if (maned.equals("mars")||maned.equals("april")||maned.equals("mai")){
            System.out.println("Sesong : Vår");
        }
        else {
            System.out.println("Feil skrevet");
        }
    }
}
//Oppgave 5
//Lag et program som leser inn et månedsnavn. Så skal programmet skrive ut hvilken årstid det er. Reglene er:
//
//Sommer : juni, juli, august
//Høst : september, oktober, november
//Vinter: desember, januar, februar,
//Vår : mars, april, mai,
//a) Lag først et program som løser det med if /else
//
//b) Lag deretter et program som løser det med bruk av switch.