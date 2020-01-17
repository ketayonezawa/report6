package jp.ac.uryukyu.ie.e195731;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.ArrayList;

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
            deck.add(new Card(4,0));
        }
        for (Card card:deck){
            System.out.println(card.getSuit() +":"+card.getNumber());
        }
        return deck;
    }
    public ArrayList<Card> makeDeck(){
        ArrayList<Card>mydeck = new ArrayList<>();
        ArrayList<Card>Enemydeck = new ArrayList<>();
        while ()
    }
}
