package jp.ac.uryukyu.ie.e195731;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;


import java.util.ArrayList;
import java.util.Random;

/**
 * ゲームを進行するクラス
 */
public class GameMaster {
    OldMaid oldMaid =new OldMaid();

    private ArrayList<Card> mydeck =new ArrayList<>();
    private ArrayList<Card> enemydeck =new ArrayList<>();
    private ArrayList<Card> deck = new ArrayList<>();
    private int suit;
    private int number;

    /**
     * ゲッターメソッド
     * @returnArrayList<Card>型
     */
    public ArrayList<Card> getDeck() {
        return deck;
    }

    /**
     * ゲッターメソッド
     * @returnArrayList<Card>型
     */
    public ArrayList<Card> getEnemydeck() {
        return enemydeck;
    }

    /**
     * ゲッターメソッド
     * @returnArrayList<Card>型
     */
    public ArrayList<Card> getMydeck() {
        return mydeck;
    }

    /**
     * ゲッターメソッド
     * @returnイント型
     */
    public int getSuit() {
        return suit;
    }

    /**
     * ゲッターメソッド
     * @returnイント型
     */
    public int getNumber() {
        return number;
    }

    /**
     * トランプのデッキを組むメソッド
     */
    public void deckBuild(){
        ArrayList<Card> deck = new ArrayList<>();
        for(int i =0;i<4;i++){
            for (int j=1;j<=13;j++){
                deck.add(new Card(i,j));
            }

        }deck.add(new Card(4,0));
        this.deck = deck;
    }

    /**
     * デッキむふたりに分けるメソッド
     */
    public void makeDeck(){
        Random random = new Random();
        ArrayList<Card> mydeck = new ArrayList<>();
        System.out.println("あなたのデッキを作りました。");
        ArrayList<Card> enemydeck = new ArrayList<>();
        System.out.println("相手のデッキを作りました。");
        boolean turn = true;
        while(true){
            if (deck.size()==0){
                break;
            }
            int x = random.nextInt(this.deck.size());
            if (turn ==true){
            turn =false;
            mydeck.add(deck.get(x));}else{
                turn =true;
                enemydeck.add(this.deck.get(x));
            }
            deck.remove(x);
        }this.mydeck = mydeck;
        this.enemydeck = enemydeck;
    }

    /**
     * 実際に動かすメソッド
     */
    public void run(){
        for (int num=0;num<100;num++){
            oldMaid.enemyDraw(getMydeck(),getEnemydeck());
            oldMaid.playerDraw(getMydeck(),getEnemydeck());
        }
    }

}
