public class Main {
    public static void main(String[] args) {
        Boss Shanks = new Boss(0,0,"NULL");
        Shanks.setHealth(700);
        Shanks.setDamage(50);
        Shanks.setBossDefence("shield");
        System.out.print(" BossHealth: " + Shanks.getHealth());
        System.out.print(" BossDamage: " + Shanks.getDamage());
        System.out.print(" BossDefence: " + Shanks.getBossDefence());
        }
    }
