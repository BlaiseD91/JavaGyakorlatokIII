
package haromszog;

/**
 *
 * @author Székely Balázs
 * 
 * 15) A program olvasson be 3 számot parancssori argumentumból. Szóljon, ha nincs elég bemenete.
 * Döntse el, hogy a számok lehetnek -e egy háromszög oldalhosszai. Ha igen, számolja ki annak kerületét és területét.
 * A terület kiszámítására alkalmazza Heron képletét.
 */
public class Haromszog {
    
    static boolean lehetHaromszog(double[] oldalak){
        //a háromszög akkor létezik, ha bármelyik két oldala nagyobb mint a harmadik és ez minden variációnal igaz
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
            System.out.println("3 bemeneti paraméter szükséges cm-ben megadva!");
            System.exit(0);
        }
        
        double[] oldalak = new double[3];
        
        for (int i = 0; i < args.length; i++) {
            oldalak[i] = Double.parseDouble(args[i]);
            if(oldalak[i] <= 0){
                System.out.println("A bemeneti paraméterek csak 0-nál nagyobb számok lehetnek!");
                System.exit(0);
            }
        }
        
        if(lehetHaromszog(oldalak)){
            System.out.println("A megadott oldalhosszok alapján a háromszög kerülete: "+keruletHaromszog(oldalak)+" cm");
            System.out.println("A megadott oldalhosszok alapján a háromszög területe: "+teruletHaromszog(oldalak)+ " cm2");
        }
        else System.out.println("A megadott paraméterekkel nem létezik háromszög!");
    }
    
}
