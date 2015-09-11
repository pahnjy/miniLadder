package com.springapp.ladder.controller;

import com.springapp.ladder.domain.Game;
import com.springapp.ladder.service.GameService;
import com.springapp.ladder.service.GameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by use on 2015-08-17.
 */
@Controller

public class GameController {

    @Autowired
    private GameServiceImpl gameService;

    public GameController() {
    }

    @RequestMapping(value = "/makeladder", method = RequestMethod.POST)
    public String makeladder(@RequestParam String playernumber, Model model){
        // ��ٸ� ������ ���� ������ �޾Ƽ� ��ٸ� ������ �����Ѵ�.
        // �׳� data �޾Ƽ� GameInput view�� ����.
        model.addAttribute("playernumber",playernumber);

        return "/page/GameInput";
    }

    @RequestMapping(value = "/startladder", method = RequestMethod.POST)
    public String startLadderGame(@RequestParam String[] playernamelist, @RequestParam String[] resultlist, Model model){
        // �÷��̾� ������ ��� ������ �޾Ƽ� ������ ����� ��� ���� ���� �Ѵ�.
        // return ��� �׸�??

        Game game = gameService.inputGameData(playernamelist,resultlist);       // ���� ������ �Է��ؼ� ���� ����.
        game = gameService.ladderMake(game);
        gameService.getGameResult(game);                                        // ���� ���

        return "/page/GameResult";
    }
    // ��ٸ� ���� ����� �м�.
    public void resultLadderGame(){

    }

}
