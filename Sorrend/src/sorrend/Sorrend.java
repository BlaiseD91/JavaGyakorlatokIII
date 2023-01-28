
package sorrend;

/**
 *
 * @author Sz�kely Bal�zs
 * 
 * 
 * 17) A program olvasson be legal�bb 2 sz�mot parancssori argumentumb�l, �s sz�ljon, ha nincs el�g bemenet.
 * Vizsg�lja meg, hogy a kapott sz�mok sorrendje n�vekv�, cs�kken�, vagy egyik sem, �s ezt �rja ki.
 */
public class Sorrend {

    
    public static void main(String[] args) {
        
        if(args.length < 2){
            System.out.println("Legal�bb 2 bemeneti param�ter sz�ks�ges!");
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
        
        if((!csokken && !no) || (csokken && no)) System.out.println("A sz�mok nincsenek cs�kken�, sem pedig n�vekv� sorrendben.");
        else if(csokken && !no) System.out.println("A sz�mok cs�kken� sorrendben vannak.");
        else if(!csokken && no) System.out.println("A sz�mok n�vekv� sorrendben vannak.");
        else  System.out.println("Valami nincs rendben!");
    }
    
}
