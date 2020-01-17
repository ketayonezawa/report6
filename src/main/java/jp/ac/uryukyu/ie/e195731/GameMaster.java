package jp.ac.uryukyu.ie.e195731;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;


import java.util.ArrayList;
import java.util.Random;

public class GameMaster {
    private int suit;
    private int number;

    public int getSuit() {
        return suit;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Card> deckBuild(){
        ArrayList<Card> deck = new ArrayList<>();
        for(int i =0;i<4;i++){
            for (int j=1;j<=13;j++){
                deck.add(new Card(i,j));
            }

        }deck.add(new Card(4,0));
        return deck;
    }
    public ArrayList<Card> makeDeck(ArrayList<Card> deck){
        Random random = new Random();
        ArrayList<Card> mydeck = new ArrayList<>();
        ArrayList<Card> Enemydeck = new ArrayList<>();
        boolean turn = true;
        while(true){
            if (deck.size()==0){
                break;
            }
            int x = random.nextInt(deck.size());
            if (turn ==true){
            turn =false;
            mydeck.add(deck.get(x));}else{
                turn =true;
                Enemydeck.add(deck.get(x));
            }
            deck.remove(x);

        }for (Card card:mydeck){
            String[] suitList ={"スペード","ハート","ダイヤ","クラブ","ジョーカー"};
            if (card.getSuit() ==4){
                System.out.println(suitList[4]);
            }else{
            System.out.println(suitList[card.getSuit()]+":"+card.getNumber());
            }
        }
        return null;
    }
}
