package sorozat;

/**
 *
 * @author Sz�kely Bal�zs @BlaiseD91
 */


/*
    10.) A program olvasson be k�t eg�sz sz�mot (x �s y) parancssori argumentumb�l.
    �rja ki az x �s y k�z�tt tal�lhat� �sszes eg�sz sz�mot (x -> y fel� haladva), valamint sz�ljon,
    ha a bemenet nem megfelel� form�tum� (itt t�bb probl�m�t is vizsg�lni kell).
*/
public class Sorozat {

    
    public static void main(String[] args) {
        int x = 0, y = 0;
        
        if(args.length != 2){
            System.out.println("Csak k�t bemeneti param�ter lehet!");
            System.exit(0);
        }
        
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        
        if(x >= y){
            System.out.println("Az els� param�ter �rt�k�nek kisebbnek kell lennie a m�sodik param�ter �rt�k�n�l");
            System.exit(0);
        }
        
        System.out.println("Eg�sz sz�mok " + x + " �s " + y + " k�z�tt:");
        for (int i = x+1; i < y; i++) {
            System.out.print(i+"; ");
        }
        
        
    }
    
}
