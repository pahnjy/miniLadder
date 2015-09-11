package com.springapp.ladder.service;

import com.springapp.ladder.domain.Game;
import com.springapp.ladder.domain.Ladder;
import org.springframework.stereotype.Service;

/**
 * Created by use on 2015-08-17.
 */
@Service
public class GameServiceImpl implements GameService{
    public Game game;
    public Ladder ladder;
    @Override
    public Game inputGameData(String[] playerlist, String[] resultlist) {
        game = new Game(playerlist, resultlist);
        return game;
    }

    /**
     * get Game Result <BR/>
     * @param game ladder game data
     * @return      ladder game data
     */
    @Override
    public Game getGameResult(Game game) {



        return null;
    }

    @Override
    public Game ladderMake(Game game) {
        // ∞‘¿”¿ª ∏∏µÎ.
        ladder.setPlayercount(game.getLadderCount());
        ladder.makeLadder();
        return game;
    }
}
