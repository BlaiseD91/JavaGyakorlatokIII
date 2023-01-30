
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
 * 
 * 
 * 22) Az elõzõ feladatban elkészített számológépünk nagyon jól mûködik, de rövidesen rájövünk, hogy hosszabb kifejezéseket is ki szeretnénk számolni.
 * Írunk tehát egy új programot, ami az alábbi felépítésû bemenetet kapja: mûveletek száma (n), kezdõérték, majd n*{operátor, operátorhoz tartozó érték}.
 * (pl. 3 1 + 2 x 2 - 1 ? 3 mûvelet, 1 a kezdõérték, és elõször +2-t végezzük el, majd *2-t, majd -1-t).
 * A program számolja ki az így kapott mûveletsorrend eredményét.
 * A mûveleteket abban a sorrendben hajtsa végre, ahogy a bemenetben szerepelnek. A program szóljon, ha nem megfelelõ a bemenet.
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
    
    static double szamol(String[] kifejezes){
        
        int muveletekSzama = Integer.parseInt(kifejezes[0]);
        double eredmeny = Double.parseDouble(kifejezes[1]);
        int index = 0;
        for (int i = 0; i < muveletekSzama; i++)
        {   
            index = index + 2;
            eredmeny = szamol(eredmeny, Double.parseDouble(kifejezes[index+1]), kifejezes[index]);
            
        }
        
        return eredmeny;
    }
    
    public static void main(String[] args) {
        //if(args.length != 3){
        if(args.length < 3){
            System.out.println("3 bemenetet kell megadni!");
            System.exit(0);
        }
        
        /*double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        String operator = args[1];*/
        
        //System.out.println(args[0]+" "+args[1]+" "+args[2]+" = "+szamol(Double.parseDouble(args[0]), Double.parseDouble(args[2]), args[1]));
        System.out.println("A megadott kifejezés értéke: "+szamol(args));
    }
    
}
