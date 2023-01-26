
package fibonacci;

/**
 *
 * @author Székely Balázs @BlaiseD91
 */



/*
13) Fibonacci sorozat elsõ n elemének kiszámítása tömb segítségével. n értékét a program parancssori argumentumként kérje,
és szóljon, ha nem pontosan egy paramétert kapott.
*/
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length != 1 || Integer.parseInt(args[0]) < 1){
            System.out.println("Nem megfelelõ a paraméter!");
            System.exit(0);
        }
        
        int[] szamok = new int[Integer.parseInt(args[0])];
        szamok[0] = 0;
        szamok[1] = 1;
        
        for (int i = 2; i < szamok.length; i++) {
            szamok[i] = szamok[i-1] + szamok[i-2];
            
        }
        System.out.println("A Fibonacci-sorozat elsõ "+Integer.parseInt(args[0])+" eleme:");
        for (int i : szamok) {
            System.out.print(i+"; ");
        }
    }
    
}
