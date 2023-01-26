
package fibonacci;

/**
 *
 * @author Sz�kely Bal�zs @BlaiseD91
 */



/*
13) Fibonacci sorozat els� n elem�nek kisz�m�t�sa t�mb seg�ts�g�vel. n �rt�k�t a program parancssori argumentumk�nt k�rje,
�s sz�ljon, ha nem pontosan egy param�tert kapott.
*/
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length != 1 || Integer.parseInt(args[0]) < 1){
            System.out.println("Nem megfelel� a param�ter!");
            System.exit(0);
        }
        
        int[] szamok = new int[Integer.parseInt(args[0])];
        szamok[0] = 0;
        szamok[1] = 1;
        
        for (int i = 2; i < szamok.length; i++) {
            szamok[i] = szamok[i-1] + szamok[i-2];
            
        }
        System.out.println("A Fibonacci-sorozat els� "+Integer.parseInt(args[0])+" eleme:");
        for (int i : szamok) {
            System.out.print(i+"; ");
        }
    }
    
}
