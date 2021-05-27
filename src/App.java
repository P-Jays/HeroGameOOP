// creating hero
class Hero {
    String name;
    double health;
    int level;

    Weapon weapon;
    Armor armor;

    // hero constructor
    Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmon(Armor armor) {
        this.armor = armor;
    }

    void attack(Hero opponent) {
        double attackPower = this.weapon.attack;

        /*
        there is still weakness in this code cuz 
        i can change directly the attack power from here 
        therefore i need an encapsulation
        */
        // double attackPower = 200;
        System.out.println("\n"+this.name+" attacking "+opponent.name+" with power of "+attackPower+"\n");
        opponent.defense(attackPower);
    }

    void defense(double attackPower){
        double demage;
        if(this.armor.defense < attackPower){
            demage = attackPower - this.armor.defense;
        }else{
            demage = 0;
        }

        this.health -= demage;
        System.out.println(this.name+ " get damage of "+demage+"\n");
    }

    void display() {
        System.out.println("Name    : " + this.name);
        System.out.println("Health  : " + this.health);
        this.weapon.display();
        this.armor.display();
    }

}

// creating weapon
class Weapon {
    String name;
    double attack;

    // weapon constructor
    Weapon(String name, double attack) {
        this.name = name;
        this.attack = attack;
    }

    void display() {
        System.out.println("Weapon  : " + this.name);
        System.out.println("Attack  : " + this.attack);
    }
}

// creating armor
class Armor {
    String name;
    double defense;

    // armor constructor
    Armor(String name, double defense) {
        this.name = name;
        this.defense = defense;
    }

    void display() {
        System.out.println("Armor   : " + this.name);
        System.out.println("Defense : " + this.defense);
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        dividerLine();

        // creating hero 1
        Hero hero1 = new Hero("PJ", 100);
        Weapon spoon = new Weapon("Kitchen Spoon", 1);
        Armor shirt = new Armor("T-shirt", 0);
        hero1.setWeapon(spoon);
        hero1.setArmon(shirt);
        hero1.display();
        dividerLine();

        // creating hero 2
        Hero darkhero = new Hero("Kelvin", 100);
        Weapon gun = new Weapon("AK-47", 20);
        Armor uniform = new Armor("SAS-Classic", 10);
        darkhero.setWeapon(gun);
        darkhero.setArmon(uniform);
        darkhero.display();
        dividerLine();

        // episode 1 
        hero1.attack(darkhero);
        hero1.display();
        fightLine();
        darkhero.display();
        dividerLine();

        // episode 2
        darkhero.attack(hero1);
        darkhero.display();
        fightLine();
        hero1.display();
        dividerLine();

    }

    static void dividerLine() {
        System.out.println("");
        for (int i = 0; i <= 25; i++) {
            System.out.print("=");
        }
        System.out.println("");
        System.out.println("");
    }

    static void fightLine() {
        System.out.println("");
        for (int i = 0; i <= 8; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("");
    }
}
