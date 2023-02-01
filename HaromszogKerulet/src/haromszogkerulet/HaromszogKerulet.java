package haromszogkerulet;

/**
 *
 * @author Székely Balázs
 *
 * 25) Készítsünk programot, ami megadott háromszögek közül kiválasztja, hogy
 * melyiknek a legnagyobb a kerülete. A program parancssori argumentumból kapja
 * a bemenetét az alábbi módon: elõször a háromszögek darabszáma (n), utána
 * hármasával az oldalhosszak (n*{oldal1 oldal2 oldal3}) következnek
 * (pl. 2 1 2 3 3 3 4 ? 2 háromszög, az egyik oldalai 1,2,3, a másik oldalai 3,3,4).
 * Állapítsuk meg, hogy hanyadik háromszögnek a legnagyobb a kerülete. A program
 * szóljon, ha nem megfelelõ a bemenet.
 */
public class HaromszogKerulet {


    public static void main(String[] args) {
        final int darab = Integer.parseInt(args[0]);
        if(args.length < 4 || ((args.length-1) % 3 !=0) || ((args.length-1) % darab !=0)){
            System.out.println("A bemenet nem megfelelõ!");
            System.exit(0);
        }

        double[][] haromszogek = new double[darab][3];
        int index = 1;
        for (int i = 0; i < darab; i++) {
            
            for (int j = 0; j < 3; j++) {
                haromszogek[i][j] = Double.parseDouble(args[index]);
                //System.out.println(haromszogek[i][j]);
                index++;
            }
        }
        
        double[] keruletek = new double[darab];
        for (int i = 0; i < darab; i++) {
            keruletek[i] = haromszogek[i][0]+haromszogek[i][1]+haromszogek[i][2];
            //System.out.println(keruletek[i]);
        }
        
        int maxHely = 0;
        for (int i = 1; i < darab; i++) {
            if(keruletek[i] > keruletek[maxHely]) maxHely=i;
        }
        
        System.out.println("A bemeneti paraméterek alapján a "+(maxHely+1)+". háromszög kerülete a legnagyobb.");
        
        
        
        
    }

}
