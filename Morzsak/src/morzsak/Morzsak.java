package morzsak;

/**
 *
 * @author Székely Balázs
 *
 * Jancsi és Juliska az erdõben sétálva minden keresztezõdésnél morzsákat szór
 * el. Jancsi az elsõ keresztezõdésben 3 szemet, Juliska a második
 * keresztezõdésben 2 szemet. Minden további keresztezõdésben annyi szemet
 * szórnak el, mint az elõzõ kettõben összesen. A sétájuk az n-edik
 * keresztezõdésben ér véget, ugyanis itt egy életnagyságú mézeskalács házzal
 * találják szemben magukat, de mielõtt bemennek, még itt is elszórnak
 * valamennyi morzsát. Mennyi morzsát szórtak el a ház elõtt? A keresztezõdések
 * számát (n értékét) parancssori argumentumból kapjuk bemenetnek. A program
 * írja ki az utolsó keresztezõdésben elszórt morzsa mennyiségét. A program
 * szóljon, ha nem kapott bemenetet.
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
            System.out.println("Bemenetként add meg a keresztezõdések számát");
            System.exit(0);
        }
        
        int szorasok = Integer.parseInt(args[0]);
        
        System.out.println("Az elszórt morzsák száma: "+szoras(szorasok));
    }

}
