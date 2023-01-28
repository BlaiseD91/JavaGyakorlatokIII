
package sorrend;

/**
 *
 * @author Székely Balázs
 * 
 * 
 * 17) A program olvasson be legalább 2 számot parancssori argumentumból, és szóljon, ha nincs elég bemenet.
 * Vizsgálja meg, hogy a kapott számok sorrendje növekvõ, csökkenõ, vagy egyik sem, és ezt írja ki.
 */
public class Sorrend {

    
    public static void main(String[] args) {
        
        if(args.length < 2){
            System.out.println("Legalább 2 bemeneti paraméter szükséges!");
        }
        
        double[] szamok = new double[args.length];
        
        for (int i = 0; i < args.length; i++) {
            szamok[i] = Double.parseDouble(args[i]);
        }
        
        boolean csokken = false, no = false;
        
        for (int i = 1; i < szamok.length; i++) {
            if(szamok[i-1] < szamok[i]) {
                no = true;
                if (csokken){
                    break;
                }
            }
            else if(szamok[i-1] > szamok[i]) {
                csokken = true;
                if(no){
                    break;
                }
            }
        }
        
        if((!csokken && !no) || (csokken && no)) System.out.println("A számok nincsenek csökkenõ, sem pedig növekvõ sorrendben.");
        else if(csokken && !no) System.out.println("A számok csökkenõ sorrendben vannak.");
        else if(!csokken && no) System.out.println("A számok növekvõ sorrendben vannak.");
        else  System.out.println("Valami nincs rendben!");
    }
    
}
