package hgwrt;

public class Main {

    public static void findBestGryffindor(Gryffindor first, Gryffindor second){
        int sumFirst = first.getNobility() + first.getHonor() + first.getCourage();
        int sumSecond = second.getNobility() + second.getHonor() + second.getCourage();
        if (sumFirst > sumSecond) {
            System.out.println(first.getName() + " лучший гриффиндорец, чем " + second.getName());
        }
        else {
            System.out.println(second.getName() + " лучший гриффиндорец, чем " + first.getName());
        }
    }

    public static void findBestHufflepuff(Hufflepuff first, Hufflepuff second){
        int sumFirst = first.getDiligence() + first.getLoyalty() + first.getHonesty();
        int sumSecond = second.getDiligence() + second.getLoyalty() + second.getHonesty();
        if (sumFirst > sumSecond) {
            System.out.println(first.getName() + " лучший пуффендуец, чем " + second.getName());
        }
        else {
            System.out.println(second.getName() + " лучший пуффендуец чем " + first.getName());
        }
    }

    public static void findBestSlytherin(Slytherin first, Slytherin second){
        int sumFirst = first.getCunning() + first.getDetermination() + first.getAmbitiousness() + first.getResourcefulness() + first.getHungerForPower();
        int sumSecond = second.getCunning() + second.getDetermination() + second.getAmbitiousness() + second.getResourcefulness() + second.getHungerForPower();
        if (sumFirst > sumSecond) {
            System.out.println(first.getName() + " лучший слизеринец, чем " + second.getName());
        }
        else {
            System.out.println(second.getName() + " лучший слизеринец, чем " + first.getName());
        }
    }

    public static void findBestRavenclaw(Ravenclaw first, Ravenclaw second){
        int sumFirst = first.getIntelligence() + first.getWisdom() + first.getWit() + first.getCreativity();
        int sumSecond = second.getIntelligence() + second.getWisdom() + second.getWit() + second.getCreativity();
        if (sumFirst > sumSecond) {
            System.out.println(first.getName() + " лучший когтевранец, чем " + second.getName());
        }
        else {
            System.out.println(second.getName() + " лучший когтевранец, чем " + first.getName());
        }
    }

    public static void findBestStudent(Hogwarts first, Hogwarts second){
        if (first.getMagicPower() > second.getMagicPower()) {
            System.out.println(first.getName() + " обладает бОльшей мощностью магии, чем " + second.getName());
        }
        else {
            System.out.println(second.getName() + " обладает бОльшей мощностью магии, чем " + first.getName());
        }
        if (first.getTransgressDistance() > second.getTransgressDistance()) {
            System.out.println(first.getName() + " может трансгрессировать дальше, чем " + second.getName());
        }
        else {
            System.out.println(second.getName() + " может трансгрессировать дальше, чем " + first.getName());
        }
    }

    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter",35,54,45,71,78);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger",89, 6, 45, 87, 6);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley",24,64,45, 46,4);
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy",4,7,98,85,4,8,45);
        Slytherin grahamMontague = new Slytherin("Graham Montague",9,75,45,31,78,9, 78);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle",45,6,89,45,29,49,24);
        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith",46,46,8,45,32);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory",4,45,11,69,36);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley",74,58,96,1,8);
        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang",87,98,54,36,1,2);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil",49,89,16,1,96,2);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby",78,45,6,25,4, 6);

        harryPotter.printCharacteristics();
        zachariasSmith.printCharacteristics();
        dracoMalfoy.printCharacteristics();
        zhouChang.printCharacteristics();

        findBestGryffindor(hermioneGranger,ronWeasley);
        findBestHufflepuff(cedricDiggory, justinFinchFletchley);
        findBestRavenclaw(padmaPatil,marcusBelby);
        findBestSlytherin(grahamMontague, gregoryGoyle);

        findBestStudent(dracoMalfoy, harryPotter);
    }
}
