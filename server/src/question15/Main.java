package question15;
//ゴブリンに10のダメージ!
public class Main {
    public static void main(String[] args) {
        Yusha taro = new Yusha("タロウ", 10);
        Monster goblin = new Monster("ゴブリン", 20);

        //変数taroの持つメソッドattackを呼び出す。
        //引数はgoblinとする。
        taro.attack(goblin);
    }
}
