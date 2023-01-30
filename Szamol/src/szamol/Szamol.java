
package szamol;

/**
 *
 * @author Székely Balázs
 * 
 * 21) Matek ZH-ra készülés közben elromlott a számológépünk, ezért elhatározzuk, hogy írunk egy programot, ami helyettesíteni fogja. 
 * A számológépünk mindig két értéken végez el mûveletet, ezért a program pontosan 3 bemenetet kapjon parancssori argumentumból: 
 * az elsõ számot, az operátort, valamin a második számot (pl. 3 + 1). 
 * Írjuk ki, hogy mi lesz a megadott kifejezés eredménye. A program szóljon, ha nem 3 bemenetet kapott. 
 * (tipp: szorzásnál * helyett más karaktert használjunk bemenetnek, pl. x)
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
                System.out.println("Hibás operátort adtál meg!");
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
