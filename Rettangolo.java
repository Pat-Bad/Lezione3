public class Rettangolo {
    private int altezza;
    private int larghezza;

    //costruttore//
    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    //metodi//
    public int calcolaPerimetro() {
        return (altezza + larghezza) * 2;

    }

    public int calcolaArea() {
        return altezza * larghezza;
    }

    public void stampaRettangolo() {
        int area = calcolaArea();
        int perimetro = calcolaPerimetro();

        System.out.println(area);
        System.out.println(perimetro);
    }

    public void stampaDueRettangoli(Rettangolo myRettangolo, Rettangolo myRettangolo2){
        int area = myRettangolo.calcolaArea();
        int area2 = myRettangolo2.calcolaArea();
        int perimetro = myRettangolo.calcolaPerimetro();
        int perimetro2 = myRettangolo2.calcolaPerimetro();
        System.out.print("Primo rettangolo " + area + ", " + perimetro + ". ");
        System.out.println("Secondo rettangolo " + area2 +", " + perimetro2);
        System.out.println("La somma delle due aree è " + area + area2);
        System.out.println("La somma dei due perimetri è " + perimetro + perimetro2);

    }

    public static void main(String[] args) {

        Rettangolo myRettangolo = new Rettangolo(5, 2);
            myRettangolo.stampaRettangolo();

        Rettangolo myRettangolo2 = new Rettangolo (15, 3);
        myRettangolo2.stampaRettangolo();
        //posso invocare il metodo su qualsiasi oggetto Rettangolo, l'importante è passargli i parametri//
       myRettangolo.stampaDueRettangoli(myRettangolo, myRettangolo2);
       //ho lo stesso risultato con questa riga//
       myRettangolo2.stampaDueRettangoli(myRettangolo, myRettangolo2);

        }
    }

