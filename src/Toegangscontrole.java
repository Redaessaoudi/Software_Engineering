import java.util.Properties;
public class Toegangscontrole {
    int aantal = 0;
    int maximum_aantal = 5;

    int increment(){
        if (aantal < maximum_aantal){
            aantal = aantal + 1;
            System.out.print("Een persoon werd toegevoegd. Het aantal personen in  de zaal is nu van: ");

        } else{
            System.out.println("De zaal is vol. Je hebt het maximum bereikt");
        }
        return aantal;
    }


    int decrement(){
        if( aantal > 0 && aantal <= maximum_aantal){
            aantal = aantal - 1;
            System.out.print("Een person kwam eruit. Het aantal personen in  de zaal is nu van: ");

        } else {
            System.out.println("We hebben geen plaats meer in de zaal.");


        }
        return aantal;
    }
    boolean magBinnen(){
        if (aantal < maximum_aantal) {
            System.out.print("We hebben nog plaats je mag binnnen komen.");return true;
        } else { System.out.print("We hebben te veel mensen in de zaal. ");return false;}
    }

}
