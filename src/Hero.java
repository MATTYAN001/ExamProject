public class Hero extends Character {
    String weapon;
    public Hero() {}
    public Hero(String name, int hp, String weapon){
        super(name,hp);
        this.weapon = weapon;
    }
    /*public final boolean isAlive() {
        return this.hp > 0;
    }*/
    public void attack(Creature target){
        System.out.println(getName() + "は" + this.weapon + "で攻撃！" +
                target.getName() + "に10のダメージを与えた！");
        target.setHp(target.getHp() - 10);
    }
    public String getWeapon(){
        return this.weapon = weapon;
    }
    public void setWeapon(){
        this.weapon = weapon;
    }
}
