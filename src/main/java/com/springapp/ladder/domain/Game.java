package com.springapp.ladder.domain;

/**
 * Created by use on 2015-08-17.
 */
public class Game {

    int ladderCount;
    String player[];
    String gameResult[];

    public Game(String[] player,String[] gameResult){
        this.player = player;
        this.gameResult = gameResult;
        this.ladderCount = player.length;
    }

    public int getLadderCount() {
        return ladderCount;
    }

    public void setLadderCount(int ladderCount) {
        ladderCount = ladderCount;
    }

    public String[] getPlayer() {
        return player;
    }

    public void setPlayer(String[] player) {
        this.player = player;
    }

    public String[] getGameResult() {
        return gameResult;
    }

    public void setGameResult(String[] gameResult) {
        this.gameResult = gameResult;
    }
}
