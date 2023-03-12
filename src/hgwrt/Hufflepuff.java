package hgwrt;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public void printCharacteristics() {
        System.out.println("Ученик " + getName() + ", магическая сила " + getMagicPower() + ", расстояние трансгрессии " + getTransgressDistance() + ", трудолюбие " + this.diligence + ", верность " + this.loyalty + ", честность " + this.honesty);
    }
}
