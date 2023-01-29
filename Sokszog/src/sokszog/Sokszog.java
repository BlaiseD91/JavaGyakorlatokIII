
package sokszog;

/**
 *
 * @author Sz�kely Bal�zs
 * 
 * 19) K�sz�ts�nk programot, ami kisz�molja egy szab�lyos soksz�g ker�let�t.
 * A program k�t bemenetet v�r parancssori argumentumb�l: a soksz�g oldalainak a sz�m�t, valamint az oldalhosszat.
 * A probl�ma csak az, hogy a programoz�si nyelv�nkben "elromlott" a szorz�s, �gy ezt a m�veletet nem haszn�lhatjuk a feladat megold�sa sor�n.
 * A program sz�ljon, ha nem 2 bemenetet kapott.
 */
public class Sokszog {

    
    public static void main(String[] args) {
        
        if(args.length != 2){
            System.out.println("K�t bemeneti param�ter sz�ks�ges, a soksz�g oldalainak sz�ma �s az oldalhossz!");
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
        
        System.out.println("A szab�lyos soksz�g ker�lete: "+kerulet);
    }
    
}
