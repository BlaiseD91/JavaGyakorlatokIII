
package leghosszabbszo;

/**
 *
 * @author Székely Balázs
 * 
 * 20) Egy könyv olvasása közben kíváncsiak leszünk, hogy melyik lehet a benne található leghosszabb szó,
 * ezért készítünk egy programot, ami eldönti ezt nekünk.
 * A program a könyvben található szavakat kapja bemenetnek parancssori argumentumból (tetszõleges mennyiségû szó).
 * Írjuk ki, hogy melyik a bemenetben található leghosszabb szó (ha több leghosszabbat is találunk,
 * akkor bármelyiket kiírhatjuk). A program szóljon, ha nem kapott bemenetet.
 */
public class LeghosszabbSzo {
    
    static String[] tisztit(String[] szavak){
        String[] tisztitottStr = new String[szavak.length];
        
        for (int i = 0; i < szavak.length; i++) {
            tisztitottStr[i] = szavak[i].replace(".", "").replace(",", "")
                    .replace(";", "").replace("?", "").replace("!", "").replace(":", "")
                    .replace("(", "").replace(")", "");
        }
        
        return tisztitottStr;
    }
    
    static int leghosszabbHelye(String[] bemenet){
        int hely = 0;
        
        String[] szavak = tisztit(bemenet);
        for (int i = 1; i < szavak.length; i++) {
            if(szavak[hely].length() < szavak[i].length()) hely = i;
        }
        return hely;
    }
    
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("A program nem kapott bemenetet!");
            System.exit(0);
        }

        System.out.println("A leghosszabb szó a(z): "+args[leghosszabbHelye(args)]);
        
        
    }
    
}
