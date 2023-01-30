package morzsak;

/**
 *
 * @author Sz�kely Bal�zs
 *
 * Jancsi �s Juliska az erd�ben s�t�lva minden keresztez�d�sn�l morzs�kat sz�r
 * el. Jancsi az els� keresztez�d�sben 3 szemet, Juliska a m�sodik
 * keresztez�d�sben 2 szemet. Minden tov�bbi keresztez�d�sben annyi szemet
 * sz�rnak el, mint az el�z� kett�ben �sszesen. A s�t�juk az n-edik
 * keresztez�d�sben �r v�get, ugyanis itt egy �letnagys�g� m�zeskal�cs h�zzal
 * tal�lj�k szemben magukat, de miel�tt bemennek, m�g itt is elsz�rnak
 * valamennyi morzs�t. Mennyi morzs�t sz�rtak el a h�z el�tt? A keresztez�d�sek
 * sz�m�t (n �rt�k�t) parancssori argumentumb�l kapjuk bemenetnek. A program
 * �rja ki az utols� keresztez�d�sben elsz�rt morzsa mennyis�g�t. A program
 * sz�ljon, ha nem kapott bemenetet.
 */
public class Morzsak {
    
    static int szoras(int szorasSzam){
        int morzsak = 5, paros = 2, paratlan = 3;
        
        for (int i = 3; i <= szorasSzam; i++) {
            if(szorasSzam == 0){
                morzsak = 0;
                break;
            }
            else if(szorasSzam == 1){
                morzsak = paros;
                break;
            }
            else if(szorasSzam == 2){
                morzsak = paros;
                break;
            }
            else{
                if(i % 2 == 0){
                    morzsak = morzsak + paros + paratlan;
                    paros = paros + paratlan;
                }
                else{
                    morzsak = morzsak + paros + paratlan;
                    paratlan = paratlan + paros;
                }
            }
            
        }
        return morzsak;
    }
    
    public static void main(String[] args) {
        
        if(args.length != 1){
            System.out.println("Bemenetk�nt add meg a keresztez�d�sek sz�m�t");
            System.exit(0);
        }
        
        int szorasok = Integer.parseInt(args[0]);
        
        System.out.println("Az elsz�rt morzs�k sz�ma: "+szoras(szorasok));
    }

}
