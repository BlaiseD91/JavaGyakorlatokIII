package dinnye;

/**
 *
 * @author Székely Balázs
 *
 *
 * 24) Kisboltunkba egy szállítmány dinnye érkezik, amit átvétel elõtt
 * leellenõrzünk, lemérjük mindegyiket. A dinnyék súlyai lesznek a program
 * bemenete, ezeket parancssori argumentumból olvassuk be (tetszõleges darab
 * egész szám). Tudjuk, hogy ha egy dinnye súlya páros szám, és osztható 3-al
 * is, akkor biztos rohadt lesz, ezeket nem szeretnénk átvenni. A program
 * állapítsa meg a súlyok alapján, hogy hány problémás dinnye található a
 * szállítmányban. A program szóljon, ha nem kapott bemenetet.
 */
public class Dinnye {

    
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Legalább egy bemenet szükséges!");
            System.exit(0);
        }
        
        int[] sulyok = new int[args.length];
        
        for (int i = 0; i < args.length; i++) {
            int suly = Integer.parseInt(args[i]);
            if(suly < 1){
                System.out.println("Nincs negatív vagy 0 súlyú dinnye!");
                System.exit(0);
            }
            else if(!((suly % 2 == 0) && (suly % 3 == 0))){
                sulyok[i] = suly;
            }
        }
        
        int rohadt = 0;
        for (int i : sulyok) {
            if(i == 0) rohadt++;
        }
        
        System.out.println("A szállítmányban "+rohadt+" db problémás dinnye található.");
    }

}
