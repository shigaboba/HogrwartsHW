package hgwrt;

public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressDistance;

    public Hogwarts(String name, int magicPower, int transgressDistance){
        this.name = name;
        this.magicPower = magicPower;
        this.transgressDistance = transgressDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressDistance(int transgressDistance) {
        this.transgressDistance = transgressDistance;
    }

    public void printCharacteristics() {
    }

}
