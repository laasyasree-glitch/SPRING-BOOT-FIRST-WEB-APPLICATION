package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
	
	@Override
	public void up() {
		System.out.println("JUMP");
	}
	@Override
	public void down() {
		System.out.println("GO INTO HOLE");
	}
	@Override
	public void left() {
		System.out.println("STOP");
	}
	@Override
	public void right() {
		System.out.println("GO FASTER");
	}
}
