package reklam;

/**
 *
 * @author Székely Balázs
 *
 * 26) Reklámozni szeretnénk a legújabb termékünket, és készítünk egy programot,
 * ami elektronikus hirdetõtáblaként megteszi ezt nekünk. A hirdetõtábla egymás
 * után szövegeket fog kiírni a képernyõre: vagy a termék nevét, vagy a termék
 * árát. A program 3 bemenetet kap parancssori argumentumból: az elsõ a termék
 * neve, a második a termék ára, a harmadik pedig egy szám, hogy összesen hány
 * sort szeretnénk kiírni a táblára. Alapesetben a hirdetõtábla mindig a termék
 * nevét írja ki, de minden 5. kiírás a termék árát fogja kiírni ehelyett. A
 * program szóljon, ha nem 3 bemenetet kap.
 */
public class Reklam {

    static void hirdet(String szoveg, int ar, int hanyszor){
        for (int i = 1; i <= hanyszor; i++) {
            if(i%5 == 0) System.out.println("Ára: "+ar+"Ft");
            else System.out.println(szoveg);
        }
    }
    public static void main(String[] args) {
        if(args.length !=3){
            System.out.println("A bemenetek száma nem megfelelõ!");
            System.exit(0);
        }
        String termekNev = args[0];
        int termekAr = Integer.parseInt(args[1]);
        int hanyszor = Integer.parseInt(args[2]);
        
        hirdet(termekNev, termekAr, hanyszor);
        
    }

}
