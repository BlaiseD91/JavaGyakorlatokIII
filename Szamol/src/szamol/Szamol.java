
package szamol;

/**
 *
 * @author Sz�kely Bal�zs
 * 
 * 21) Matek ZH-ra k�sz�l�s k�zben elromlott a sz�mol�g�p�nk, ez�rt elhat�rozzuk, hogy �runk egy programot, ami helyettes�teni fogja. 
 * A sz�mol�g�p�nk mindig k�t �rt�ken v�gez el m�veletet, ez�rt a program pontosan 3 bemenetet kapjon parancssori argumentumb�l: 
 * az els� sz�mot, az oper�tort, valamin a m�sodik sz�mot (pl. 3 + 1). 
 * �rjuk ki, hogy mi lesz a megadott kifejez�s eredm�nye. A program sz�ljon, ha nem 3 bemenetet kapott. 
 * (tipp: szorz�sn�l * helyett m�s karaktert haszn�ljunk bemenetnek, pl. x)
 */
public class Szamol {

    static double szamol(double szam1, double szam2, String op){
        
        double eredmeny = 0;
        switch(op){
            case "-" -> eredmeny = szam1 - szam2;
            case "+" -> eredmeny = szam1 + szam2;
            case "/" -> eredmeny = szam1 / szam2;
            case "x" -> eredmeny = szam1 * szam2;
            case "X" -> eredmeny = szam1 * szam2;
            default -> {
                System.out.println("Hib�s oper�tort adt�l meg!");
                System.exit(0);
            }
        }
        return eredmeny;
    }
    
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("3 bemenetet kell megadni!");
            System.exit(0);
        }
        
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        String operator = args[1];
        
        System.out.println(a+" "+operator+" "+b+" = "+szamol(a, b, operator));
        
    }
    
}
