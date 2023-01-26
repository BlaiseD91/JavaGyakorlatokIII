package sorozat;

/**
 *
 * @author Székely Balázs @BlaiseD91
 */


/*
    10.) A program olvasson be két egész számot (x és y) parancssori argumentumból.
    Írja ki az x és y között található összes egész számot (x -> y felé haladva), valamint szóljon,
    ha a bemenet nem megfelelõ formátumú (itt több problémát is vizsgálni kell).
*/
public class Sorozat {

    
    public static void main(String[] args) {
        int x = 0, y = 0;
        
        if(args.length != 2){
            System.out.println("Csak két bemeneti paraméter lehet!");
            System.exit(0);
        }
        
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        
        if(x >= y){
            System.out.println("Az elsõ paraméter értékének kisebbnek kell lennie a második paraméter értékénél");
            System.exit(0);
        }
        
        System.out.println("Egész számok " + x + " és " + y + " között:");
        for (int i = x+1; i < y; i++) {
            System.out.print(i+"; ");
        }
        
        
    }
    
}
