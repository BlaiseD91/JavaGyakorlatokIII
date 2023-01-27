
package dobokocka;

/**
 *
 * @author Székely Balázs
 * 
 * 
 * 16) A program olvasson be egy n egész számot parancssori argumentumból. Szóljon, ha nincs bemenet.
 * Dobjon egy hatoldalú kockával n alkalommal (véletlenszerû értékeket), és mentse tömbbe,hogy az egyes értékeket hányszor dobta ki.
 * Ezután írja ki, hogy az különbözõ értékek az dobások hány százalékában fordultak elõ.
 */
public class Dobokocka {


    public static void main(String[] args) {
        
        if(args.length != 1){
            System.out.println("Bemeneti paraméterként egy egész számot kell megadnod!");
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
            System.out.println("A dobott számok között "+(i+1)+" érték "+Math.round(((double)dobasok[i])/n*100)+" %-ban fordult elõ");
        }
        
    }
    
}
