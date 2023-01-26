
package karakterszam;

/**
 *
 * @author Sz�kely Bal�zs
 * 
 * 
 * 14) Tetsz�leges sz�m� sz� beolvas�sa parancssori argumentumb�l.
 * A program sz�molja meg, hogy milyen hossz�s�g� sz�b�l mennyi van, ezeket az �rt�keket t�rolja t�mbben
 * (pl. 1 hossz� sz� 3 db, 2 hossz� sz� 0 db, 3 hossz� sz� 4 db, stb.).
 * A kapott �rt�keket �rja ki, valamint sz�ljon, ha nincs megadva bemeneti sz�.
 */
public class KarakterSzam {


    public static void main(String[] args) {
        
        if (args.length == 0){
            System.out.println("Legal�bb egy bemeeti param�ter k�telez�!");
            System.exit(0);
        }
        
        int[] szoHossz = new int[args.length];
        
        
        for (String szo : args) {
            szoHossz[szo.length()]++;
        }
        for (int i = 1; i < szoHossz.length; i++) {
            if(szoHossz[i] != 0) System.out.println(i+" karakterb�l �ll� szavak sz�ma: "+szoHossz[i]+" db");
        }
    }
    
}
