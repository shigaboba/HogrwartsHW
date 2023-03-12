package hgwrt;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int magicPower, int transgressDistance, int nobility, int honor, int courage){
        super (name, magicPower, transgressDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public void printCharacteristics() {
        System.out.println("Ученик " + getName() + ", магическая сила " + getMagicPower() + ", расстояние трансгрессии " + getTransgressDistance() + ", благородство " + this.nobility + ", честь " + this.honor + ", храбрость " + this.courage);
    }


}
