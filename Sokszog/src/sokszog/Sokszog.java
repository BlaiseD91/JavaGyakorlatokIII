
package sokszog;

/**
 *
 * @author Székely Balázs
 * 
 * 19) Készítsünk programot, ami kiszámolja egy szabályos sokszög kerületét.
 * A program két bemenetet vár parancssori argumentumból: a sokszög oldalainak a számát, valamint az oldalhosszat.
 * A probléma csak az, hogy a programozási nyelvünkben "elromlott" a szorzás, így ezt a mûveletet nem használhatjuk a feladat megoldása során.
 * A program szóljon, ha nem 2 bemenetet kapott.
 */
public class Sokszog {

    
    public static void main(String[] args) {
        
        if(args.length != 2){
            System.out.println("Két bemeneti paraméter szükséges, a sokszög oldalainak száma és az oldalhossz!");
            System.exit(0);
        }
        
        int oldalszam = Integer.parseInt(args[0]);
        if(oldalszam < 3){
            System.out.println("Minimum 3 oldalnak lennie kell!");
            System.exit(0);
        }
        double oldalhossz = Double.parseDouble(args[1]);
        
        double kerulet = 0;
        for (int i = 1; i <= oldalszam; i++) {
            kerulet += oldalhossz;
        }
        
        System.out.println("A szabályos sokszög kerülete: "+kerulet);
    }
    
}
