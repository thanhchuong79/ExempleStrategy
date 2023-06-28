public class Robot {
    IBehaviour behaviour;
    String name; //nom robot

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBehaviour(IBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void move(){
        //recuperer une des command

        System.out.println("Le robot "+this.name+ " Execute l'algorithme de mouvement: ");
        int command = this.behaviour.moveCommand();//afficher un message
    }
}
