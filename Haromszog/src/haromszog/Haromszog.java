
package haromszog;

/**
 *
 * @author Sz�kely Bal�zs
 * 
 * 15) A program olvasson be 3 sz�mot parancssori argumentumb�l. Sz�ljon, ha nincs el�g bemenete.
 * D�ntse el, hogy a sz�mok lehetnek -e egy h�romsz�g oldalhosszai. Ha igen, sz�molja ki annak ker�let�t �s ter�let�t.
 * A ter�let kisz�m�t�s�ra alkalmazza Heron k�plet�t.
 */
public class Haromszog {
    
    static boolean lehetHaromszog(double[] oldalak){
        //a h�romsz�g akkor l�tezik, ha b�rmelyik k�t oldala nagyobb mint a harmadik �s ez minden vari�ci�nal igaz
        boolean lehet = false;
        
        if((oldalak[0]+oldalak[1] > oldalak[2]) &&
           (oldalak[1]+oldalak[2] > oldalak[0]) &&
           (oldalak[0]+oldalak[2] > oldalak[1])) {
           
            lehet = true;
        }
        return lehet;
    }
    
    static double keruletHaromszog(double[] oldalak){
        return oldalak[0]+oldalak[1]+oldalak[2];
    }
    
    static double teruletHaromszog(double[] oldalak){
        double a = oldalak[0], b = oldalak[1], c = oldalak[2];
        double s = (a+b+c) /2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
    }
    
    public static void main(String[] args) {
        
        if (args.length != 3){
            System.out.println("3 bemeneti param�ter sz�ks�ges cm-ben megadva!");
            System.exit(0);
        }
        
        double[] oldalak = new double[3];
        
        for (int i = 0; i < args.length; i++) {
            oldalak[i] = Double.parseDouble(args[i]);
            if(oldalak[i] <= 0){
                System.out.println("A bemeneti param�terek csak 0-n�l nagyobb sz�mok lehetnek!");
                System.exit(0);
            }
        }
        
        if(lehetHaromszog(oldalak)){
            System.out.println("A megadott oldalhosszok alapj�n a h�romsz�g ker�lete: "+keruletHaromszog(oldalak)+" cm");
            System.out.println("A megadott oldalhosszok alapj�n a h�romsz�g ter�lete: "+teruletHaromszog(oldalak)+ " cm2");
        }
        else System.out.println("A megadott param�terekkel nem l�tezik h�romsz�g!");
    }
    
}
