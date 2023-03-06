package com.springpractice.learnspringframework;

import com.springpractice.learnspringframework.game.GameRunner;
import com.springpractice.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
