public class Sim {
    private int phoneNumber;
    private double creditoDisponibile;
    private String[] ultimeChiamate;

    //costruttore//

    public Sim (int phoneNumber){
        this.phoneNumber = phoneNumber;
        this.creditoDisponibile = 0;
        this.ultimeChiamate = new String[]{"0"};
    }
//metodi//
public void stampaDati(){
        System.out.println("I dati della sim sono i seguenti: numero di telefono " + phoneNumber + ", credito disponibile "
                + creditoDisponibile + ", ultime chiamate registrate" + ultimeChiamate);
}
    public static void main(String[] args) {
        Sim mySim = new Sim(334951732);
        mySim.stampaDati();
        Sim anotherSim = new Sim (1234567);
        anotherSim.stampaDati();
    }

    public void setUltimeChiamate(){
        
    }
}
