public abstract class Monster implements Creature{
    private String name;
    private int hp;
    private char suffix;
    public Monster() {}
    public Monster(String name,char suffix,int hp) {
        this.suffix = suffix;
        if(hp < 0){
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.name = name;
        this.hp = hp;
    }
    public final boolean isAlive() {
        return this.hp > 0;
    }
    public void showStatus() {
        System.out.println(this.name + this.suffix + "：HP " + this.hp);
    }
    public String getName(){
        return this.name;
    }
    public int getHp(){
        return this.hp;
    }
    public char getSuffix(){
        return this.suffix;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHp(int hp) {
        if(hp > 0){
            this.hp = hp;
        }else{
            this.hp = 0;
        }
    }
    public void setSuffix(char suffix) {
        this.suffix = suffix;
    }
}
