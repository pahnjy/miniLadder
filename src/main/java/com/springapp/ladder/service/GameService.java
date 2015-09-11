package com.springapp.ladder.service;

import com.springapp.ladder.domain.Game;

/**
 * Created by use on 2015-08-17.
 */
public interface GameService {

    // 플레이어 정보와 결과 정보를 게임객체에 추가한다.

    Game inputGameData(String[] playerlist, String[] resultlist);

    //게임 결과를 받아옴
    Game getGameResult(Game game);

    //사다리를 만든다.
    Game ladderMake(Game game);
}
