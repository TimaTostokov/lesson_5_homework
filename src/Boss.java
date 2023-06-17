public class Boss {
    private int health;
    private  int damage;
    private  String bossDefence;

    public Boss(int health, int damage, String bossDefence){
        this.health = health;
        this.damage = damage;
        this.bossDefence = bossDefence;
    }
    public Boss(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getBossDefence() {
        return bossDefence;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setBossDefence(String bossDefence) {
        this.bossDefence = bossDefence;
    }
}
