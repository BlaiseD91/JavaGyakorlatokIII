
package szamol;

/**
 *
 * @author Sz�kely Bal�zs
 * 
 * 21) Matek ZH-ra k�sz�l�s k�zben elromlott a sz�mol�g�p�nk, ez�rt elhat�rozzuk, hogy �runk egy programot, ami helyettes�teni fogja. 
 * A sz�mol�g�p�nk mindig k�t �rt�ken v�gez el m�veletet, ez�rt a program pontosan 3 bemenetet kapjon parancssori argumentumb�l: 
 * az els� sz�mot, az oper�tort, valamin a m�sodik sz�mot (pl. 3 + 1). 
 * �rjuk ki, hogy mi lesz a megadott kifejez�s eredm�nye. A program sz�ljon, ha nem 3 bemenetet kapott. 
 * (tipp: szorz�sn�l * helyett m�s karaktert haszn�ljunk bemenetnek, pl. x)
 * 
 * 
 * 22) Az el�z� feladatban elk�sz�tett sz�mol�g�p�nk nagyon j�l m�k�dik, de r�videsen r�j�v�nk, hogy hosszabb kifejez�seket is ki szeretn�nk sz�molni.
 * �runk teh�t egy �j programot, ami az al�bbi fel�p�t�s� bemenetet kapja: m�veletek sz�ma (n), kezd��rt�k, majd n*{oper�tor, oper�torhoz tartoz� �rt�k}.
 * (pl. 3 1 + 2 x 2 - 1 ? 3 m�velet, 1 a kezd��rt�k, �s el�sz�r +2-t v�gezz�k el, majd *2-t, majd -1-t).
 * A program sz�molja ki az �gy kapott m�veletsorrend eredm�ny�t.
 * A m�veleteket abban a sorrendben hajtsa v�gre, ahogy a bemenetben szerepelnek. A program sz�ljon, ha nem megfelel� a bemenet.
 */
public class Szamol {

    static double szamol(double szam1, double szam2, String op){
        
        double eredmeny = 0;
        switch(op){
            case "-" -> eredmeny = szam1 - szam2;
            case "+" -> eredmeny = szam1 + szam2;
            case "/" -> eredmeny = szam1 / szam2;
            case "x" -> eredmeny = szam1 * szam2;
            case "X" -> eredmeny = szam1 * szam2;
            default -> {
                System.out.println("Hib�s oper�tort adt�l meg!");
                System.exit(0);
            }
        }
        return eredmeny;
    }
    
    static double szamol(String[] kifejezes){
        
        int muveletekSzama = Integer.parseInt(kifejezes[0]);
        double eredmeny = Double.parseDouble(kifejezes[1]);
        int index = 0;
        for (int i = 0; i < muveletekSzama; i++)
        {   
            index = index + 2;
            eredmeny = szamol(eredmeny, Double.parseDouble(kifejezes[index+1]), kifejezes[index]);
            
        }
        
        return eredmeny;
    }
    
    public static void main(String[] args) {
        //if(args.length != 3){
        if(args.length < 3){
            System.out.println("3 bemenetet kell megadni!");
            System.exit(0);
        }
        
        /*double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        String operator = args[1];*/
        
        //System.out.println(args[0]+" "+args[1]+" "+args[2]+" = "+szamol(Double.parseDouble(args[0]), Double.parseDouble(args[2]), args[1]));
        System.out.println("A megadott kifejez�s �rt�ke: "+szamol(args));
    }
    
}
