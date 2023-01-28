
package rendelesek;

/**
 *
 * @author Székely Balázs
 * 
 * 
 * Beérkezõ rendelések összértékét szeretnénk meghatározni. Ehhez parancssorról a rendelések sorszámait kapjuk meg,
 * ami tetszõleges darab egész szám formájában jön. Négy különbözõ rendelésünk van, az
 *          1-es 1000 Ft, 
 *          2-es 5000 Ft, 
 *          3-as 7000 Ft és a 
 *          4-es 9000 Ft. 
 * Egy rendelés sorszáma többször is szerepelhet. Adjuk össze az érkezõ sorszámoknak megfelelõ értékeket, 
 * és az összeget írjuk ki. Ha olyan szám szerepel, ami nem rendes sorszám (nem 1,2,3,4),
 * akkor minden esetben írjuk ki konzolra, hogy "Nem megfelelo sorszam". A program szóljon, ha nincs legalább 1 bemenet.
 */
public class Rendelesek {

    public static void main(String[] args) {
        
        if(args.length < 1){
            System.out.println("Legalább 1 bemeneti paraméter szükséges!");
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
                    System.out.println("Nem megfelelõ sorszám");
                
            }
        }
        
        System.out.println("A rendelések végösszege: "+osszeg+" Ft.");
    }
    
}
