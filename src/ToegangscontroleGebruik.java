public class ToegangscontroleGebruik {
    private Toegangscontrole controle;

    public void main(String[] args){


    System.out.println(controle.increment());
    System.out.println(controle.increment());
    System.out.println(controle.increment());
    System.out.println(controle.increment());// 4 mensen worden binnen gebracht

    System.out.println(controle.magBinnen()); // Er word gecontroleerd als er een mens binnen mag komen.

    System.out.println(controle.increment()); // Het antwoord geeft 5

    System.out.println(controle.aantal); // het aantal mensen dat in de zaal zijn

    System.out.println(controle.magBinnen()); // Het antwoord is false er kunnen geen mensen binnen

    System.out.println(controle.aantal); // Er wordt terug gecontroleerd

    System.out.println(controle.decrement()); // Er gaat een mens weg

    System.out.println(controle.decrement()); // Er gaat nog is een persoon weg

    System.out.println(controle.aantal); // Er wordt weer gecontroleerd voor het aantal mensen in de zaal
}
}