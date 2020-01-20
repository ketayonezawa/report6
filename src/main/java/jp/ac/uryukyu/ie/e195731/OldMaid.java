package jp.ac.uryukyu.ie.e195731;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * ババ抜きのクラス
 */
public class OldMaid {
    String[] suitList ={"スペード","ハート","ダイヤ","クラブ","ジョーカー"};
    int x;
    Card draw;
    Random random = new Random();

    /**
     * 相手がドローするメソッド
     * @param mydeck　ArrayList<Card>自分のデッキ
     * @param enemydeck　ArrayList<Card>相手のデッキ
     */
    public void enemyDraw(ArrayList<Card> mydeck,ArrayList<Card> enemydeck){
        x = random.nextInt(mydeck.size());
        enemydeck.add(mydeck.get(x));
        System.out.println(suitList[mydeck.get(x).getSuit()]+"の"+mydeck.get(x).getNumber()+"を引かれた");
        draw =mydeck.get(x);
        mydeck.remove(x);
        checkMyGame(mydeck);
        enemyPair(enemydeck);
    }

    /**
     * 相手の手札のペアを探すメソッド
     * @param deck　ArrayList<Card>
     */
    public void enemyPair(ArrayList<Card> deck){
        int deckSize = deck.size()-1;
        for (int i =0;i<deckSize;i++){
            if (deck.get(i).getNumber()==draw.getNumber()){
                deck.remove(i);
                deck.remove(deckSize-1);
                break;
            }
        }checkEnemyGame(deck);
}

    /**
     * 入力をするメソッド
     * @return入力したもの
     */
    public static String Return(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("引く");
        return scanner.nextLine();
    }

    /**
     * 自分がドローするメソッド
     * @param mydeck　ArrayList<Card>
     * @param enemydeck　ArrayList<Card>
     */
    public void playerDraw(ArrayList<Card> mydeck,ArrayList<Card> enemydeck){
        //Return();
        x = random.nextInt(enemydeck.size());
        mydeck.add(enemydeck.get(x));
        System.out.println(suitList[enemydeck.get(x).getSuit()]+"の"+enemydeck.get(x).getNumber()+"を引いた");
        draw =enemydeck.get(x);
        enemydeck.remove(x);
        checkEnemyGame(enemydeck);
        myPair(mydeck);
    }

    /**
     * 自分のペアを探すメソッド
     * @param deck　ArrayList<Card>
     */
    public void myPair(ArrayList<Card> deck){
        int deckSize = deck.size()-1;
        for (int i =0;i<deckSize;i++){
            if (deck.get(i).getNumber()==draw.getNumber()){
                deck.remove(i);
                deck.remove(deckSize-1);
                break;
            }
        }checkMyGame(deck);
        /**
         * 自分の手札の枚数を確認するメソッド
         */
    }public void checkMyGame(ArrayList<Card> mydeck){
        if (mydeck.size()==0){
            System.out.println("あなたの勝ち");
            System.exit(0);
        }

    }

    /**
     * 相手の手札の枚数を確認するメソッド
     * @param enemydeck　ArrayList<Card>
     */
    public void checkEnemyGame(ArrayList<Card> enemydeck){
        if (enemydeck.size()==0){
            System.out.println("あなたの負け");
            System.exit(0);
        }
    }

}
