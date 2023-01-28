
package rendelesek;

/**
 *
 * @author Sz�kely Bal�zs
 * 
 * 
 * Be�rkez� rendel�sek �ssz�rt�k�t szeretn�nk meghat�rozni. Ehhez parancssorr�l a rendel�sek sorsz�mait kapjuk meg,
 * ami tetsz�leges darab eg�sz sz�m form�j�ban j�n. N�gy k�l�nb�z� rendel�s�nk van, az
 *          1-es 1000 Ft, 
 *          2-es 5000 Ft, 
 *          3-as 7000 Ft �s a 
 *          4-es 9000 Ft. 
 * Egy rendel�s sorsz�ma t�bbsz�r is szerepelhet. Adjuk �ssze az �rkez� sorsz�moknak megfelel� �rt�keket, 
 * �s az �sszeget �rjuk ki. Ha olyan sz�m szerepel, ami nem rendes sorsz�m (nem 1,2,3,4),
 * akkor minden esetben �rjuk ki konzolra, hogy "Nem megfelelo sorszam". A program sz�ljon, ha nincs legal�bb 1 bemenet.
 */
public class Rendelesek {

    public static void main(String[] args) {
        
        if(args.length < 1){
            System.out.println("Legal�bb 1 bemeneti param�ter sz�ks�ges!");
            System.exit(0);
        }
        
        int[] rendelesek = new int[args.length];
        
        for (int i = 0; i < args.length; i++) {
            rendelesek[i] = Integer.parseInt(args[i]);
        }
        
        int[] rendelesArak = new int[]{1000, 5000, 7000, 9000};
        
        int osszeg = 0;
        
        for (int i = 0; i < rendelesek.length; i++) {
            
            switch(rendelesek[i]){
                case 1:
                    osszeg += rendelesArak[0];
                    break;
                case 2:
                    osszeg += rendelesArak[1];
                    break;
                case 3:
                    osszeg += rendelesArak[2];
                    break;
                case 4:
                    osszeg += rendelesArak[3];
                    break;
                default:
                    System.out.println("Nem megfelel� sorsz�m");
                
            }
        }
        
        System.out.println("A rendel�sek v�g�sszege: "+osszeg+" Ft.");
    }
    
}
