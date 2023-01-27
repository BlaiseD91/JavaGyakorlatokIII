
package dobokocka;

/**
 *
 * @author Sz�kely Bal�zs
 * 
 * 
 * 16) A program olvasson be egy n eg�sz sz�mot parancssori argumentumb�l. Sz�ljon, ha nincs bemenet.
 * Dobjon egy hatoldal� kock�val n alkalommal (v�letlenszer� �rt�keket), �s mentse t�mbbe,hogy az egyes �rt�keket h�nyszor dobta ki.
 * Ezut�n �rja ki, hogy az k�l�nb�z� �rt�kek az dob�sok h�ny sz�zal�k�ban fordultak el�.
 */
public class Dobokocka {


    public static void main(String[] args) {
        
        if(args.length != 1){
            System.out.println("Bemeneti param�terk�nt egy eg�sz sz�mot kell megadnod!");
            System.exit(0);
        }
        
        int n = Integer.parseInt(args[0]);
        
        int[] dobasok = new int[6];
        
        int dobas;
        
        for (int i = 0; i < n; i++) {
            dobas = (int) (Math.round(1+(Math.random()*5)));
            System.out.println(dobas);
            switch (dobas){
                case 1:
                    dobasok[0]++;
                    break;
                case 2:
                    dobasok[1]++;
                    break;
                case 3:
                    dobasok[2]++;
                    break;
                case 4:
                    dobasok[3]++;
                    break;
                case 5:
                    dobasok[4]++;
                    break;
                case 6:
                    dobasok[5]++;
                    break;
                default:
                    System.out.println("Valami nincs rendben");
                    System.exit(0); 
            }
        }
        for (int i = 0; i < dobasok.length; i++) {
            System.out.println("A dobott sz�mok k�z�tt "+(i+1)+" �rt�k "+Math.round(((double)dobasok[i])/n*100)+" %-ban fordult el�");
        }
        
    }
    
}
