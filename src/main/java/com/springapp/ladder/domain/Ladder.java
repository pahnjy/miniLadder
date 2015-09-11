package com.springapp.ladder.domain;

/**
 * Created by use on 2015-08-17.
 */
public class Ladder {
    public static int MAX_LADDER_LENGTH = 20;       // 사다리 총 길이
    public static int RANDOM_DATA = 3;              // 3은 30%
    boolean ladder[][];         // 사다리 2차원 배열.      false : │ true : ─
    private int playercount;

    public static int getMaxLadderLength() {
        return MAX_LADDER_LENGTH;
    }

    public static void setMaxLadderLength(int maxLadderLength) {
        MAX_LADDER_LENGTH = maxLadderLength;
    }

    public static int getRandomData() {
        return RANDOM_DATA;
    }

    public static void setRandomData(int randomData) {
        RANDOM_DATA = randomData;
    }

    public boolean[][] getLadder() {
        return ladder;
    }

    public void setLadder(boolean[][] ladder) {
        this.ladder = ladder;
    }

    public int getPlayercount() {
        return playercount;
    }

    public void setPlayercount(int playercount) {
        this.playercount = playercount;
    }

    public Ladder(int playercount){
        this.playercount = playercount;
        ladder = new boolean[MAX_LADDER_LENGTH][playercount];           // 20열 playercount 행  20 row
    }

    /**
     * 사다리 생성하는 메소드
     * @return 사다리 2차원 배열
     */

    public void makeLadder(){

        for(int i =0; i < ladder[0].length -1 ; i++){
            for(int j = 0; j < playercount; j++){
                if(checkHorizon()){                         // 수평선을 그을지 확률 계산
                    if(checkLadder(ladder[i][j])){          // 해당 사다리에 선을 그을수 있는지 확인
                        lineHorizon(ladder,i,j);            // 해당 사다리에 선을 긋기
                    }
                }
            }
        }
    }

    /**
     * 사다리의 수평선을 그을지 확률로 선택하는 메소드
     * 확률은 30%
     * @return
     */
    private boolean checkHorizon(){
        int random = (int)Math.random()*10;
        if((random%10) > RANDOM_DATA){
            return true;
        } else {
            return false;
        }
    }

    /**
     * 해당 사다리에 선을 그을수 있는지 확인한다.
     * 기존 사다리의 데이터가 true면 줄이 그어져 있어서 false로 전달한다.
     * @param ladderdata 사다리의 수평선 데이터. false : │ true : ─
     * @return  선을 그을수 있는지 전달.
     */
    private boolean checkLadder(boolean ladderdata){
        return !ladderdata;
    }

    /**
     *  사다리의 수평선을 긋는다.
     * @param ladder 사다리 데이터 배열
     * @param row       사다리의 선을 그을 열
     * @param column    사다리의 선을 그을 행
     */
    private void lineHorizon(boolean[][] ladder, int row, int column){
        ladder[row][column] = true;
        ladder[row][column+1] = true;
    }


}
