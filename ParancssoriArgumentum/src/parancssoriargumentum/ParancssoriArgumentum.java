
package parancssoriargumentum;

/**
 *
 * @author Sz�kely Bal�zs @BlaiseD91
 */

/*
1) A program olvasson be tetsz�leges eg�sz sz�mot parancssori argumentumb�l, �s hat�rozza meg azok minimum�t.
    Sz�ljon, ha ehhez nincs el�g (legal�bb 2) bemenet.
2) A program olvasson be tetsz�leges eg�sz sz�mot parancssori argumentumb�l, �s hat�rozza meg azok maximum�t.
    Sz�ljon, ha ehhez nincs el�g (legal�bb 2) bemenet.
3) A program olvasson be tetsz�leges eg�sz sz�mot parancssori argumentumb�l, �s hat�rozza meg azok �sszeg�t.
    Sz�ljon, ha ehhez nincs el�g (legal�bb 2) bemenet.
4) A program olvasson be tetsz�leges eg�sz sz�mot parancssori argumentumb�l, �s hat�rozza meg azok �tlag�t.
    Sz�ljon, ha ehhez nincs el�g (legal�bb 2) bemenet.
5) A program olvasson be tetsz�leges eg�sz sz�mot parancssori argumentumb�l, �s sz�molja meg, hogy �sszesen h�ny pozit�v sz�mot olvasott be.
    Sz�ljon, ha nem kap bemeneti param�tereket.
6) A program olvasson be tetsz�leges eg�sz sz�mot parancssori argumentumb�l, �s sz�molja meg, hogy �sszesen h�ny negat�v sz�mot olvasott be.
    Sz�ljon, ha nem kap bemeneti param�tereket.
7) A program olvasson be tetsz�leges eg�sz sz�mot parancssori argumentumb�l, �s sz�molja meg, hogy �sszesen h�ny null�t olvasott be.
    Sz�ljon, ha nem kap bemeneti param�tereket.
8) A program olvasson be tetsz�leges eg�sz sz�mot parancssori argumentumb�l, �s �rja ki, hogy a p�ratlan, vagy a p�ros sz�mok �sszege a nagyobb.

II. Met�dusok
1) K�sz�ts programot, amely a parancssori argumentumb�l tetsz�leges darab eg�sz sz�mot olvas be.
Sz�ljon, ha nincs legal�bb 1 bemenet, �s l�pjen ki. A programnak legyen egy met�dusa, ami egy int t�mb�t v�r param�ternek,
�s visszaadja a t�mbben tal�lhat� sz�mok �sszeg�t. Ezt a visszaadott �rt�ket �rja ki.
2) K�sz�ts programot, amely a parancssori argumentumb�l tetsz�leges darab eg�sz sz�mot olvas be.
Sz�ljon, ha nincs legal�bb 1 bemenet, �s l�pjen ki. A programnak legyen egy met�dusa, ami egy int t�mb�t v�r param�ternek,
�s visszaadja a t�mbben tal�lhat� sz�mok �tlag�t. Ezt a visszaadott �rt�ket �rja ki.
3) K�sz�ts programot, amely a parancssori argumentumb�l tetsz�leges darab eg�sz sz�mot olvas be.
Sz�ljon, ha nincs legal�bb 1 bemenet, �s l�pjen ki. A programnak legyen egy met�dusa, ami egy int t�mb�t v�r param�ternek,
�s visszaadja a t�mbben tal�lhat� legkisebb elem �rt�k�t. Ezt a visszaadott �rt�ket �rja ki.
4) K�sz�ts programot, amely a parancssori argumentumb�l tetsz�leges darab eg�sz sz�mot olvas be.
Sz�ljon, ha nincs legal�bb 1 bemenet, �s l�pjen ki. A programnak legyen egy met�dusa, ami egy int t�mb�t v�r param�ternek,
�s visszaadja a t�mbben tal�lhat� legnagyobb elem �rt�k�t. Ezt a visszaadott �rt�ket �rja ki.
*/



public class ParancssoriArgumentum {

    //1. feladat megold�sa II/3. megold�sa
    static int minValue(int[] tomb){
        int min =Integer.MAX_VALUE;
        
        if(tomb.length < 2){ 
            System.out.println("Nincs el�g bemeneti param�ter a minimum meghat�roz�s�hoz!");
            return 0;
        }
        else {
            for (int i : tomb) {
                if(i < min) { min = i; }
            }
            return min;
        }
        
    }
    
    //2. feladat megold�sa II/4. megold�sa
    static int maxValue(int[] tomb){
        int max =Integer.MIN_VALUE;
        
        if(tomb.length < 2){ 
            System.out.println("Nincs el�g bemeneti param�ter a minimum meghat�roz�s�hoz!");
            return 0;
        }
        else {
            for (int i : tomb) {
                if(i > max) { max = i; }
            }
            return max;
        }
        
    }
    
    //3. feladat megold�sa II/1-re is alkalmazhat�
    static int sum(int[] tomb){
        int sum = 0;
        
        if(tomb.length < 2){ 
            System.out.println("Nincs el�g bemeneti param�ter a minimum meghat�roz�s�hoz!");
            return 0;
        }
        else {
            for (int i : tomb) {
                sum += i;
            }
            return sum;
        }
        
    }
    
    //4. feladat megold�sa II/2-re is alkalmazhat�
    static double avg(int[] tomb){
        double sum = 0.0;
        
        if(tomb.length < 2){ 
            System.out.println("Nincs el�g bemeneti param�ter a minimum meghat�roz�s�hoz!");
            return 0;
        }
        else {
            for (int i : tomb) {
                sum += Double.valueOf(i);
            }
            return sum / tomb.length;
        }  
    }
    
    //5. feladat megold�sa
    static int countPositive(int[] tomb){
        int pcs = 0;
        
        if(tomb.length < 2){ 
            System.out.println("Nincs el�g bemeneti param�ter a minimum meghat�roz�s�hoz!");
            return 0;
        }
        else {
            for (int i : tomb) {
                if( i > 0) { pcs++; }
            }
            return pcs;
        }  
    }
        
    //6. feladat megold�sa
    static int countNegative(int[] tomb){
        int pcs = 0;
        
        if(tomb.length < 2){ 
            System.out.println("Nincs el�g bemeneti param�ter a minimum meghat�roz�s�hoz!");
            return 0;
        }
        else {
            for (int i : tomb) {
                if( i < 0) { pcs++; }
            }
            return pcs;
        }  
    }
    
    //7. feladat megold�sa
    static int countZero(int[] tomb){
        int pcs = 0;
        
        if(tomb.length < 2){ 
            System.out.println("Nincs el�g bemeneti param�ter a minimum meghat�roz�s�hoz!");
            return 0;
        }
        else {
            for (int i : tomb) {
                if( i == 0) { pcs++; }
            }
            return pcs;
        }  
    }
    
    //8. feladat megold�sa
    static String evenOddSum(int[] tomb){
        int evenSum = 0, oddSum = 0;
        
        if(tomb.length < 2){ 
            return "Nincs el�g bemeneti param�ter a minimum meghat�roz�s�hoz!";
        }
        else {
            for (int i : tomb) {
                if( i%2 == 0)
                    evenSum += i;
                else
                    oddSum += i;
            }
            if (evenSum > oddSum)
               return "A p�ros sz�mok �sszege nagyobb";
            else if (oddSum > evenSum)
                return "A p�ratlan sz�mok �sszege nagyobb";
            else
                return "A p�ros sz�mok �sszege megegyezik a p�ratlan sz�mok �sszeg�vel";
        }  
    }
    
    
    public static void main(String[] args) {
        
        
        int[] params = new int[args.length];
        
        for (int i = 0; i < args.length; i++) {
            params[i] = Integer.parseInt(args[i]);
        }
        
        System.out.println("A bemeneti param�terek minimum �rt�ke: "+minValue(params)+"\n");
        
        System.out.println("A bemeneti param�terek maximum �rt�ke: "+maxValue(params)+"\n");
        
        System.out.println("A bemeneti param�terek �sszege: "+sum(params)+"\n");
        
        System.out.println("A bemeneti param�terek �tlaga: "+avg(params)+"\n");
        
        System.out.println("A bemeneti param�terek k�z�tt "+countPositive(params)+" db pozit�v sz�m tal�lhat�\n");
        
        System.out.println("A bemeneti param�terek k�z�tt "+countNegative(params)+" db negat�v sz�m tal�lhat�\n");
        
        System.out.println("A bemeneti param�terek k�z�tt "+countZero(params)+" db 0 �rt�k tal�lhat�\n");
        
        System.out.println(evenOddSum(params)+"\n");
    }
    
}
