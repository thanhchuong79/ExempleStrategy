public class AgressiveBehaviour implements IBehaviour{
    public  int moveCommand(){
        System.out.println("- Poursuivre le joueur");
        System.out.println("- Tirer des balles");
        return 2;
    }
}
