
package leghosszabbszo;

/**
 *
 * @author Sz�kely Bal�zs
 * 
 * 20) Egy k�nyv olvas�sa k�zben k�v�ncsiak lesz�nk, hogy melyik lehet a benne tal�lhat� leghosszabb sz�,
 * ez�rt k�sz�t�nk egy programot, ami eld�nti ezt nek�nk.
 * A program a k�nyvben tal�lhat� szavakat kapja bemenetnek parancssori argumentumb�l (tetsz�leges mennyis�g� sz�).
 * �rjuk ki, hogy melyik a bemenetben tal�lhat� leghosszabb sz� (ha t�bb leghosszabbat is tal�lunk,
 * akkor b�rmelyiket ki�rhatjuk). A program sz�ljon, ha nem kapott bemenetet.
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

        System.out.println("A leghosszabb sz� a(z): "+args[leghosszabbHelye(args)]);
        
        
    }
    
}
