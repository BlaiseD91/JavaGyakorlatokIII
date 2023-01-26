
package szamtanimertani;

/**
 *
 * @author Sz�kely Bal�zs @BlaiseD91
 */

/*
11) Sz�mtani sorozat (eg�sz sz�mokb�l) els� n elem�nek kisz�mol�sa t�mb seg�ts�g�vel.
A program a sorozat kezd�elem�t, a differenci�t, illetve n �rt�k�t parancssori argumentumb�l olvassa, valamint sz�ljon,
ha nem megfelel� a bemeneti param�terek sz�ma.

12) M�rtani sorozat (eg�sz sz�mokb�l) els� n elem�nek kisz�mol�sa t�mb seg�ts�g�vel.
A program a sorozat kezd�elem�t, a kv�cienst, illetve n �rt�k�t parancssori argumentumb�l olvassa, valamint sz�ljon,
ha nem megfelel� a bemeneti param�terek sz�ma.
*/
public class SzamtaniMertani {

    // 11. feladat megold�sa
    static void szamtaniSorozat(String[] tomb){
        if(tomb.length != 3){
            System.out.println("3 bemeneti param�tert kell megadnod: kezd��rt�k, differencia, elemsz�m");
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
            System.out.println("Az elemsz�m minimum �rt�ke 1!");
            System.exit(0);
        }
        int[] sorozat = new int[elemszam];
        
        sorozat[0] = kezdo;
        for (int i = 1; i < elemszam; i++) {
            kezdo += diff;
            sorozat[i] = kezdo;
        }
        System.out.println("A sz�mtani sorozat elemei:");
        for (int i : sorozat) {
            System.out.print(i+"; ");
        }
    }
    
    // 12. feladat megold�sa
    static void mertaniSorozat(String[] tomb){
        if(tomb.length != 3){
            System.out.println("3 bemeneti param�tert kell megadnod: kezd��rt�k, differencia, elemsz�m");
            System.exit(0);
        }
        
        double kezdo = Double.parseDouble(tomb[0]);
        double kvociens = Double.parseDouble(tomb[1]);
        int elemszam = Integer.parseInt(tomb[2]);
        
        if(kvociens == 0){
            System.out.println("A kv�ciens nem lehet 0!");
            System.exit(0);
        }
        if(elemszam < 1){
            System.out.println("Az elemsz�m minimum �rt�ke 1!");
            System.exit(0);
        }
        
        double[] sorozat = new double[elemszam];
        
        sorozat[0] = kezdo;
        for (int i = 1; i < elemszam; i++) {
            double szam = kezdo * Math.pow(kvociens, i);
            sorozat[i] = szam;
        }
        System.out.println("A m�rtani sorozat elemei:");
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
