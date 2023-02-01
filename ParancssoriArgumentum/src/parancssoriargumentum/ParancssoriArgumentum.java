
package parancssoriargumentum;

/**
 *
 * @author Székely Balázs @BlaiseD91
 */

/*
1) A program olvasson be tetszõleges egész számot parancssori argumentumból, és határozza meg azok minimumát.
    Szóljon, ha ehhez nincs elég (legalább 2) bemenet.
2) A program olvasson be tetszõleges egész számot parancssori argumentumból, és határozza meg azok maximumát.
    Szóljon, ha ehhez nincs elég (legalább 2) bemenet.
3) A program olvasson be tetszõleges egész számot parancssori argumentumból, és határozza meg azok összegét.
    Szóljon, ha ehhez nincs elég (legalább 2) bemenet.
4) A program olvasson be tetszõleges egész számot parancssori argumentumból, és határozza meg azok átlagát.
    Szóljon, ha ehhez nincs elég (legalább 2) bemenet.
5) A program olvasson be tetszõleges egész számot parancssori argumentumból, és számolja meg, hogy összesen hány pozitív számot olvasott be.
    Szóljon, ha nem kap bemeneti paramétereket.
6) A program olvasson be tetszõleges egész számot parancssori argumentumból, és számolja meg, hogy összesen hány negatív számot olvasott be.
    Szóljon, ha nem kap bemeneti paramétereket.
7) A program olvasson be tetszõleges egész számot parancssori argumentumból, és számolja meg, hogy összesen hány nullát olvasott be.
    Szóljon, ha nem kap bemeneti paramétereket.
8) A program olvasson be tetszõleges egész számot parancssori argumentumból, és írja ki, hogy a páratlan, vagy a páros számok összege a nagyobb.

II. Metódusok
1) Készíts programot, amely a parancssori argumentumból tetszõleges darab egész számot olvas be.
Szóljon, ha nincs legalább 1 bemenet, és lépjen ki. A programnak legyen egy metódusa, ami egy int tömböt vár paraméternek,
és visszaadja a tömbben található számok összegét. Ezt a visszaadott értéket írja ki.
2) Készíts programot, amely a parancssori argumentumból tetszõleges darab egész számot olvas be.
Szóljon, ha nincs legalább 1 bemenet, és lépjen ki. A programnak legyen egy metódusa, ami egy int tömböt vár paraméternek,
és visszaadja a tömbben található számok átlagát. Ezt a visszaadott értéket írja ki.
3) Készíts programot, amely a parancssori argumentumból tetszõleges darab egész számot olvas be.
Szóljon, ha nincs legalább 1 bemenet, és lépjen ki. A programnak legyen egy metódusa, ami egy int tömböt vár paraméternek,
és visszaadja a tömbben található legkisebb elem értékét. Ezt a visszaadott értéket írja ki.
4) Készíts programot, amely a parancssori argumentumból tetszõleges darab egész számot olvas be.
Szóljon, ha nincs legalább 1 bemenet, és lépjen ki. A programnak legyen egy metódusa, ami egy int tömböt vár paraméternek,
és visszaadja a tömbben található legnagyobb elem értékét. Ezt a visszaadott értéket írja ki.
*/



public class ParancssoriArgumentum {

    //1. feladat megoldása II/3. megoldása
    static int minValue(int[] tomb){
        int min =Integer.MAX_VALUE;
        
        if(tomb.length < 2){ 
            System.out.println("Nincs elég bemeneti paraméter a minimum meghatározásához!");
            return 0;
        }
        else {
            for (int i : tomb) {
                if(i < min) { min = i; }
            }
            return min;
        }
        
    }
    
    //2. feladat megoldása II/4. megoldása
    static int maxValue(int[] tomb){
        int max =Integer.MIN_VALUE;
        
        if(tomb.length < 2){ 
            System.out.println("Nincs elég bemeneti paraméter a minimum meghatározásához!");
            return 0;
        }
        else {
            for (int i : tomb) {
                if(i > max) { max = i; }
            }
            return max;
        }
        
    }
    
    //3. feladat megoldása II/1-re is alkalmazható
    static int sum(int[] tomb){
        int sum = 0;
        
        if(tomb.length < 2){ 
            System.out.println("Nincs elég bemeneti paraméter a minimum meghatározásához!");
            return 0;
        }
        else {
            for (int i : tomb) {
                sum += i;
            }
            return sum;
        }
        
    }
    
    //4. feladat megoldása II/2-re is alkalmazható
    static double avg(int[] tomb){
        double sum = 0.0;
        
        if(tomb.length < 2){ 
            System.out.println("Nincs elég bemeneti paraméter a minimum meghatározásához!");
            return 0;
        }
        else {
            for (int i : tomb) {
                sum += Double.valueOf(i);
            }
            return sum / tomb.length;
        }  
    }
    
    //5. feladat megoldása
    static int countPositive(int[] tomb){
        int pcs = 0;
        
        if(tomb.length < 2){ 
            System.out.println("Nincs elég bemeneti paraméter a minimum meghatározásához!");
            return 0;
        }
        else {
            for (int i : tomb) {
                if( i > 0) { pcs++; }
            }
            return pcs;
        }  
    }
        
    //6. feladat megoldása
    static int countNegative(int[] tomb){
        int pcs = 0;
        
        if(tomb.length < 2){ 
            System.out.println("Nincs elég bemeneti paraméter a minimum meghatározásához!");
            return 0;
        }
        else {
            for (int i : tomb) {
                if( i < 0) { pcs++; }
            }
            return pcs;
        }  
    }
    
    //7. feladat megoldása
    static int countZero(int[] tomb){
        int pcs = 0;
        
        if(tomb.length < 2){ 
            System.out.println("Nincs elég bemeneti paraméter a minimum meghatározásához!");
            return 0;
        }
        else {
            for (int i : tomb) {
                if( i == 0) { pcs++; }
            }
            return pcs;
        }  
    }
    
    //8. feladat megoldása
    static String evenOddSum(int[] tomb){
        int evenSum = 0, oddSum = 0;
        
        if(tomb.length < 2){ 
            return "Nincs elég bemeneti paraméter a minimum meghatározásához!";
        }
        else {
            for (int i : tomb) {
                if( i%2 == 0)
                    evenSum += i;
                else
                    oddSum += i;
            }
            if (evenSum > oddSum)
               return "A páros számok összege nagyobb";
            else if (oddSum > evenSum)
                return "A páratlan számok összege nagyobb";
            else
                return "A páros számok összege megegyezik a páratlan számok összegével";
        }  
    }
    
    
    public static void main(String[] args) {
        
        
        int[] params = new int[args.length];
        
        for (int i = 0; i < args.length; i++) {
            params[i] = Integer.parseInt(args[i]);
        }
        
        System.out.println("A bemeneti paraméterek minimum értéke: "+minValue(params)+"\n");
        
        System.out.println("A bemeneti paraméterek maximum értéke: "+maxValue(params)+"\n");
        
        System.out.println("A bemeneti paraméterek összege: "+sum(params)+"\n");
        
        System.out.println("A bemeneti paraméterek átlaga: "+avg(params)+"\n");
        
        System.out.println("A bemeneti paraméterek között "+countPositive(params)+" db pozitív szám található\n");
        
        System.out.println("A bemeneti paraméterek között "+countNegative(params)+" db negatív szám található\n");
        
        System.out.println("A bemeneti paraméterek között "+countZero(params)+" db 0 érték található\n");
        
        System.out.println(evenOddSum(params)+"\n");
    }
    
}
