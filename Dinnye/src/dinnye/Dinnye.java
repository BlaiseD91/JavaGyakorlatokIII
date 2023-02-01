package dinnye;

/**
 *
 * @author Sz�kely Bal�zs
 *
 *
 * 24) Kisboltunkba egy sz�ll�tm�ny dinnye �rkezik, amit �tv�tel el�tt
 * leellen�rz�nk, lem�rj�k mindegyiket. A dinny�k s�lyai lesznek a program
 * bemenete, ezeket parancssori argumentumb�l olvassuk be (tetsz�leges darab
 * eg�sz sz�m). Tudjuk, hogy ha egy dinnye s�lya p�ros sz�m, �s oszthat� 3-al
 * is, akkor biztos rohadt lesz, ezeket nem szeretn�nk �tvenni. A program
 * �llap�tsa meg a s�lyok alapj�n, hogy h�ny probl�m�s dinnye tal�lhat� a
 * sz�ll�tm�nyban. A program sz�ljon, ha nem kapott bemenetet.
 */
public class Dinnye {

    
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Legal�bb egy bemenet sz�ks�ges!");
            System.exit(0);
        }
        
        int[] sulyok = new int[args.length];
        
        for (int i = 0; i < args.length; i++) {
            int suly = Integer.parseInt(args[i]);
            if(suly < 1){
                System.out.println("Nincs negat�v vagy 0 s�ly� dinnye!");
                System.exit(0);
            }
            else if(!((suly % 2 == 0) && (suly % 3 == 0))){
                sulyok[i] = suly;
            }
        }
        
        int rohadt = 0;
        for (int i : sulyok) {
            if(i == 0) rohadt++;
        }
        
        System.out.println("A sz�ll�tm�nyban "+rohadt+" db probl�m�s dinnye tal�lhat�.");
    }

}
