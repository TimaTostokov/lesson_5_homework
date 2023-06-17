public class Main {
    public static void main(String[] args) {
        Boss shanks = new Boss(0, 0, "NULL");
        shanks.setHealth(700);
        shanks.setDamage(50);
        shanks.setBossDefence("shield");
        System.out.print(" BossHealth: " + shanks.getHealth() + "   Boss Damage : " + shanks.getDamage() + " Boss Ability : " + shanks.getBossDefence());

        System.out.println("-----------------------------------------------------------");

        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println(" HeroesHealth = " + hero.getHealth() + " HeroesDamage = " + hero.getDamage() + " HeroesSuperAbility = " + hero.getSupersposobnost());
        }


    }

    public static Hero[] createHeroes() {
        Hero spider = new Hero(300, 20, "WEB");
        Hero golem = new Hero(250, 30);
        Hero iron = new Hero(280, 25, "Steel");
        Hero[] heroes = {spider, golem, iron};
        return heroes;
    }
}
