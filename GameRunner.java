package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	@Autowired
	private GamingConsole game;//game=>MARIO/SUPERCONTRA
	public GameRunner(GamingConsole game) {
		this.game=game;
	}
	
	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
}
