package reklam;

/**
 *
 * @author Sz�kely Bal�zs
 *
 * 26) Rekl�mozni szeretn�nk a leg�jabb term�k�nket, �s k�sz�t�nk egy programot,
 * ami elektronikus hirdet�t�blak�nt megteszi ezt nek�nk. A hirdet�t�bla egym�s
 * ut�n sz�vegeket fog ki�rni a k�perny�re: vagy a term�k nev�t, vagy a term�k
 * �r�t. A program 3 bemenetet kap parancssori argumentumb�l: az els� a term�k
 * neve, a m�sodik a term�k �ra, a harmadik pedig egy sz�m, hogy �sszesen h�ny
 * sort szeretn�nk ki�rni a t�bl�ra. Alapesetben a hirdet�t�bla mindig a term�k
 * nev�t �rja ki, de minden 5. ki�r�s a term�k �r�t fogja ki�rni ehelyett. A
 * program sz�ljon, ha nem 3 bemenetet kap.
 */
public class Reklam {

    static void hirdet(String szoveg, int ar, int hanyszor){
        for (int i = 1; i <= hanyszor; i++) {
            if(i%5 == 0) System.out.println("�ra: "+ar+"Ft");
            else System.out.println(szoveg);
        }
    }
    public static void main(String[] args) {
        if(args.length !=3){
            System.out.println("A bemenetek sz�ma nem megfelel�!");
            System.exit(0);
        }
        String termekNev = args[0];
        int termekAr = Integer.parseInt(args[1]);
        int hanyszor = Integer.parseInt(args[2]);
        
        hirdet(termekNev, termekAr, hanyszor);
        
    }

}
