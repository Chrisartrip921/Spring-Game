package com.springpractice.learnspringframework;

import com.springpractice.learnspringframework.game.GameRunner;
import com.springpractice.learnspringframework.game.MarioGame;
import com.springpractice.learnspringframework.game.PacManGame;
import com.springpractice.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
