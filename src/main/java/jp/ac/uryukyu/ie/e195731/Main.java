package jp.ac.uryukyu.ie.e195731;

import java.util.ArrayList;

/**
 * メインのクラス
 */
public class Main {
    public static void main(String[] args){
        GameMaster gameMaster = new GameMaster();
        gameMaster.deckBuild();
        gameMaster.makeDeck();
        gameMaster.run();
    }
}
