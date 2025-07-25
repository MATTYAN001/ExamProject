public class GameMaster {
    public static void main(String[] args) {
        //Character c = new Character("名無し", 50);
        Character[] party = new Character[3];
        //Hero testHero = new Hero("テスト勇者", -10, "テスト剣");
        Hero h = new Hero("勇者",100,"剣");
        Wizard w = new Wizard("魔法使い",60,20);
        Thief t = new Thief("盗賊",70);
        //h.name = "ミナト";
        //h.hp = 200;
        party[0] = h;
        party[1] = w;
        party[2] = t;
        Monster[] monsters = new Monster[3];
        Matango m = new Matango("お化けキノコ",'A',45);
        Goblin g = new Goblin("ゴブリン",'A',50);
        Slime s = new Slime("スライム",'A',40);
        monsters[0] = m;
        monsters[1] = g;
        monsters[2] = s;
        System.out.println("---味方パーティ---");
        for (int i = 0; i < party.length; i++) {
            party[i].showStatus();
        }
        System.out.println("---敵グループ---");
        for (int i = 0; i < monsters.length; i++) {
            monsters[i].showStatus();
        }
        System.out.println("\n味方の総攻撃！");
        for (int i = 0; i < party.length; i++) {
            for (int j = 0; j < monsters.length; j++) {
                party[i].attack(monsters[j]);
            }
        }
        System.out.println("\n敵の総攻撃！");
        for (int i = 0; i < party.length; i++) {
            for (int j = 0; j < monsters.length; j++) {
                monsters[i].attack(party[j]);
            }
        }
        System.out.println("\nダメージを受けた勇者が突然光だした！");
        System.out.println("勇者はスーパーヒーローに進化した！");
        SuperHero sh = new SuperHero(h);
        for (int i = 0; i < party.length; i++) {
            sh.attack(monsters[i]);
        }
        System.out.println("\n---味方パーティ最終ステータス---");
        for (int i = 0; i < party.length; i++) {
            party[i].showStatus();
            if(party[i].isAlive()){
                System.out.println("生存状況：生存");
            }else{
                System.out.println("生存状況：戦闘不能");
            }
        }
        System.out.println("\n---敵グループ最終ステータス---");
        for (int i = 0; i < party.length; i++) {
            monsters[i].showStatus();
            if(monsters[i].isAlive()){
                System.out.println("生存状況：生存");
            }else{
                System.out.println("生存状況：討伐済み");
            }
        }
    }
}
