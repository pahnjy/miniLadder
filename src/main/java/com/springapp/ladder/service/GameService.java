package com.springapp.ladder.service;

import com.springapp.ladder.domain.Game;

/**
 * Created by use on 2015-08-17.
 */
public interface GameService {

    // �÷��̾� ������ ��� ������ ���Ӱ�ü�� �߰��Ѵ�.

    Game inputGameData(String[] playerlist, String[] resultlist);

    //���� ����� �޾ƿ�
    Game getGameResult(Game game);

    //��ٸ��� �����.
    Game ladderMake(Game game);
}
