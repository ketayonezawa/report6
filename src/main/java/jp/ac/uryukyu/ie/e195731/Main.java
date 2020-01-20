package jp.ac.uryukyu.ie.e195731;

/**
 * メインのクラス
 */
public class Main {
    public static void main(String[] args){
        GameMaster gameMaster = new GameMaster();
        gameMaster.deckBuild();
        gameMaster.makeDeck();
   //     gameMaster.checkDuplications(gameMaster.getMydeck());
  //      gameMaster.checkDuplications(gameMaster.getEnemydeck());
        gameMaster.run();
    }
}
