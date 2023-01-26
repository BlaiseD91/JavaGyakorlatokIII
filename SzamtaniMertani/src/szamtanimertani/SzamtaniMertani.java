
package szamtanimertani;

/**
 *
 * @author Székely Balázs @BlaiseD91
 */

/*
11) Számtani sorozat (egész számokból) elsõ n elemének kiszámolása tömb segítségével.
A program a sorozat kezdõelemét, a differenciát, illetve n értékét parancssori argumentumból olvassa, valamint szóljon,
ha nem megfelelõ a bemeneti paraméterek száma.

12) Mértani sorozat (egész számokból) elsõ n elemének kiszámolása tömb segítségével.
A program a sorozat kezdõelemét, a kvócienst, illetve n értékét parancssori argumentumból olvassa, valamint szóljon,
ha nem megfelelõ a bemeneti paraméterek száma.
*/
public class SzamtaniMertani {

    // 11. feladat megoldása
    static void szamtaniSorozat(String[] tomb){
        if(tomb.length != 3){
            System.out.println("3 bemeneti paramétert kell megadnod: kezdõérték, differencia, elemszám");
            System.exit(0);
        }
        
        int kezdo = Integer.parseInt(tomb[0]);
        int diff = Integer.parseInt(tomb[1]);
        int elemszam = Integer.parseInt(tomb[2]);
        
        if(diff == 0){
            System.out.println("A differecia nem lehet 0!");
            System.exit(0);
        }
        if(elemszam < 1){
            System.out.println("Az elemszám minimum értéke 1!");
            System.exit(0);
        }
        int[] sorozat = new int[elemszam];
        
        sorozat[0] = kezdo;
        for (int i = 1; i < elemszam; i++) {
            kezdo += diff;
            sorozat[i] = kezdo;
        }
        System.out.println("A számtani sorozat elemei:");
        for (int i : sorozat) {
            System.out.print(i+"; ");
        }
    }
    
    // 12. feladat megoldása
    static void mertaniSorozat(String[] tomb){
        if(tomb.length != 3){
            System.out.println("3 bemeneti paramétert kell megadnod: kezdõérték, differencia, elemszám");
            System.exit(0);
        }
        
        double kezdo = Double.parseDouble(tomb[0]);
        double kvociens = Double.parseDouble(tomb[1]);
        int elemszam = Integer.parseInt(tomb[2]);
        
        if(kvociens == 0){
            System.out.println("A kvóciens nem lehet 0!");
            System.exit(0);
        }
        if(elemszam < 1){
            System.out.println("Az elemszám minimum értéke 1!");
            System.exit(0);
        }
        
        double[] sorozat = new double[elemszam];
        
        sorozat[0] = kezdo;
        for (int i = 1; i < elemszam; i++) {
            double szam = kezdo * Math.pow(kvociens, i);
            sorozat[i] = szam;
        }
        System.out.println("A mértani sorozat elemei:");
        for (double i : sorozat) {
            System.out.print(i+"; ");
        }
    }
    
    
    public static void main(String[] args) {
        
        
        szamtaniSorozat(args);
        System.out.println("");
        mertaniSorozat(args);
        
    }
    
}
