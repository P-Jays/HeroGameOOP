// creating hero
class Hero{
    String name;
    Double health;
    int level;

    Weapon weapon;
    Armor armor;

    // hero constructor
    Hero(String name, Double health){
        this.name = name;
        this.health = health;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmon(Armor armor) {
        this.armor = armor;
    }

    void display(){
        System.out.println("Name    : "+this.name);
        System.out.println("Health  : "+this.health);
        this.weapon.display();
        this.armor.display();
    }


}

// creating weapon
class Weapon{
    String name;
    Double attack;

    // weapon constructor
    Weapon(String name, Double attack){
        this.name = name;
        this.attack = attack;
    }

    void display(){
        System.out.println("Weapon  : "+this.name);
        System.out.println("Attack  : "+this.attack);
    }
}

// creating armor
class Armor{
    String name;
    Double defense;

    // armor constructor
    Armor(String name, Double defense){
        this.name = name;
        this.defense = defense;
    }

    void display(){
        System.out.println("Armor   : "+this.name);
        System.out.println("Defense : "+this.defense);
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        dividerLine();

        // creating hero 1
        Hero hero1 = new Hero("PJ", 20.8);
        Weapon sword = new Weapon("Kitchen Spoon", 1.8);
        Armor suits =  new Armor("T-shirt", 0.8);
        hero1.setWeapon(sword);
        hero1.setArmon(suits);
        hero1.display();
        dividerLine();

        // creating hero 2
        Hero darkhero = new Hero("Kid", 20.8);
        Weapon gun = new Weapon("AK-47", 20.1);
        Armor bulletProof =  new Armor("SAS-Classic", 10.8);
        darkhero.setWeapon(gun);
        darkhero.setArmon(bulletProof);
        darkhero.display();
        dividerLine();


        
    }


    static void dividerLine(){
        System.out.println("");
        for(int i = 0 ; i <= 25 ; i++){
            System.out.print("=");
        }
        System.out.println("");
        System.out.println("");
    }
}
