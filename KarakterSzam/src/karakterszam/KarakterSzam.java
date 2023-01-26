
package karakterszam;

/**
 *
 * @author Székely Balázs
 * 
 * 
 * 14) Tetszõleges számú szó beolvasása parancssori argumentumból.
 * A program számolja meg, hogy milyen hosszúságú szóból mennyi van, ezeket az értékeket tárolja tömbben
 * (pl. 1 hosszú szó 3 db, 2 hosszú szó 0 db, 3 hosszú szó 4 db, stb.).
 * A kapott értékeket írja ki, valamint szóljon, ha nincs megadva bemeneti szó.
 */
public class KarakterSzam {


    public static void main(String[] args) {
        
        if (args.length == 0){
            System.out.println("Legalább egy bemeeti paraméter kötelezõ!");
            System.exit(0);
        }
        
        int[] szoHossz = new int[args.length];
        
        
        for (String szo : args) {
            szoHossz[szo.length()]++;
        }
        for (int i = 1; i < szoHossz.length; i++) {
            if(szoHossz[i] != 0) System.out.println(i+" karakterbõl álló szavak száma: "+szoHossz[i]+" db");
        }
    }
    
}
