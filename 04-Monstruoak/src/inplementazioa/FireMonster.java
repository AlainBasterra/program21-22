package inplementazioa;


public class FireMonster implements Monstruosoa {

    String name;
    public FireMonster(String name) {
        this.name = name;
    }

    @Override
    public String attack() {
        return "Attack with fire!";
    }

}
