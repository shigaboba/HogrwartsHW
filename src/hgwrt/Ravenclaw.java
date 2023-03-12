package hgwrt;

public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressDistance, int intelligence, int wisdom, int wit, int creativity){
        super (name, magicPower, transgressDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public void printCharacteristics() {
        System.out.println("Ученик " + getName() + ", магическая сила " + getMagicPower() + ", расстояние трансгрессии " + getTransgressDistance() + ", ум " + this.intelligence + ", мудрость " + this.wisdom + ", остроумие " + this.wit + ", творчество " + this.creativity);
    }
}
