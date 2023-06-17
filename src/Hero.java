public class Hero {
    private int health;
    private  int damage;
    private  String supersposobnost;

    public Hero(int health, int damage, String supersposobnost){
        this.health = health;
        this.damage = damage;
        this.supersposobnost = supersposobnost;
    }
    public Hero(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSupersposobnost() {
        return supersposobnost;
    }

}
