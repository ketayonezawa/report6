package jp.ac.uryukyu.ie.e195731;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class OldMaid {
    String[] suitList ={"スペード","ハート","ダイヤ","クラブ","ジョーカー"};
    int x;
    Card draw;
    Random random = new Random();
    public void enemyDraw(ArrayList<Card> mydeck,ArrayList<Card> enemydeck){
        x = random.nextInt(mydeck.size());
        enemydeck.add(mydeck.get(x));
        System.out.println(suitList[mydeck.get(x).getSuit()]+"の"+mydeck.get(x).getNumber()+"を引かれた");
        draw =mydeck.get(x);
        mydeck.remove(x);
        enemyPair(enemydeck);
    }
    public void enemyPair(ArrayList<Card> deck){
        int deckSize = deck.size()-1;
        for (int i =0;i<deck.size();i++){
            if (deck.get(i).getNumber()==draw.getNumber()){
                deck.remove(i);
                deck.remove(deckSize);
                break;
            }checkEnemyGame(deck);
        }
    }
    public static String Return(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("引く");
        return scanner.nextLine();
    }
    public void playerDraw(ArrayList<Card> mydeck,ArrayList<Card> enemydeck){
        Return();
        x = random.nextInt(enemydeck.size());
        mydeck.add(enemydeck.get(x));
        System.out.println(suitList[enemydeck.get(x).getSuit()]+"の"+enemydeck.get(x).getNumber()+"を引いた");
        draw =enemydeck.get(x);
        enemydeck.remove(x);
        myPair(mydeck);
    }
    public void myPair(ArrayList<Card> deck){
        for (int i =0;i<deck.size();i++){
            int deckSize = deck.size()-1;
            if (deck.get(i).getNumber()==draw.getNumber()){
                deck.remove(i);
                deck.remove(deckSize);
                break;
            }checkMyGame(deck);
        }
    }public void checkMyGame(ArrayList<Card> mydeck){
        if (mydeck.size()==0){
            System.out.println("あなたの勝ち");
        }

    }
    public void checkEnemyGame(ArrayList<Card> enemydeck){
        if (enemydeck.size()==0){
            System.out.println("あなたの負け");
        }
    }

}
