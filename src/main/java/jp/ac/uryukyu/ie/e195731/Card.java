package jp.ac.uryukyu.ie.e195731;

/**
 * トランプのカードのクラス
 */
public class Card {
    //0:スペード，1:ハート，2:ダイヤ，3:クラブ,4:ジョーカー
    private int suit;
    //1~13の番号
    private int number;

    /**
     * ゲッターメソッド
     * @returnイント型
     */
    public int getNumber() {
        return number;
    }

    /**
     * ゲッターメソッド
     * @returnイント型
     */
    public int getSuit() {
        return suit;
    }
    Card(int suit,int number){
        this.number = number;
        this.suit = suit;
    }
}
