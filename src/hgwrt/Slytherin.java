package hgwrt;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambitiousness;
    private int resourcefulness;
    private int hungerForPower;

    public Slytherin(String name, int magicPower, int transgressDistance, int cunning, int determination, int ambitiousness, int resourcefulness, int hungerForPower){
        super (name, magicPower, transgressDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.hungerForPower = hungerForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getHungerForPower() {
        return hungerForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setHungerForPower(int hungerForPower) {
        this.hungerForPower = hungerForPower;
    }

    @Override
    public void printCharacteristics() {
        System.out.println("Ученик " + getName() + ", магическая сила " + getMagicPower() + ", расстояние трансгрессии " + getTransgressDistance() + ", хитрость " + this.cunning + ", решительность " + this.determination + ", амбициозность " + this.ambitiousness + ", находчивость " + this.resourcefulness + ", жажда власти " + this.hungerForPower);
    }
}
