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
        // 사다리 게임의 유저 개수를 받아서 사다리 게임을 생성한다.
        // 그냥 data 받아서 GameInput view를 던짐.
        model.addAttribute("playernumber",playernumber);

        return "/page/GameInput";
    }

    @RequestMapping(value = "/startladder", method = RequestMethod.POST)
    public String startLadderGame(@RequestParam String[] playernamelist, @RequestParam String[] resultlist, Model model){
        // 플레이어 정보와 결과 정보를 받아서 게임을 만들고 결과 값을 도출 한다.
        // return 결과 그림??

        Game game = gameService.inputGameData(playernamelist,resultlist);       // 게임 데이터 입력해서 게임 생성.
        game = gameService.ladderMake(game);
        gameService.getGameResult(game);                                        // 게임 결과

        return "/page/GameResult";
    }
    // 사다리 게임 결과를 분석.
    public void resultLadderGame(){

    }

}
