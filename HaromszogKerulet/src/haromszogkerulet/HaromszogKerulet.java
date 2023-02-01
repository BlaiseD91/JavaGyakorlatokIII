package haromszogkerulet;

/**
 *
 * @author Sz�kely Bal�zs
 *
 * 25) K�sz�ts�nk programot, ami megadott h�romsz�gek k�z�l kiv�lasztja, hogy
 * melyiknek a legnagyobb a ker�lete. A program parancssori argumentumb�l kapja
 * a bemenet�t az al�bbi m�don: el�sz�r a h�romsz�gek darabsz�ma (n), ut�na
 * h�rmas�val az oldalhosszak (n*{oldal1 oldal2 oldal3}) k�vetkeznek
 * (pl. 2 1 2 3 3 3 4 ? 2 h�romsz�g, az egyik oldalai 1,2,3, a m�sik oldalai 3,3,4).
 * �llap�tsuk meg, hogy hanyadik h�romsz�gnek a legnagyobb a ker�lete. A program
 * sz�ljon, ha nem megfelel� a bemenet.
 */
public class HaromszogKerulet {


    public static void main(String[] args) {
        final int darab = Integer.parseInt(args[0]);
        if(args.length < 4 || ((args.length-1) % 3 !=0) || ((args.length-1) % darab !=0)){
            System.out.println("A bemenet nem megfelel�!");
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
        
        System.out.println("A bemeneti param�terek alapj�n a "+(maxHely+1)+". h�romsz�g ker�lete a legnagyobb.");
        
        
        
        
    }

}
