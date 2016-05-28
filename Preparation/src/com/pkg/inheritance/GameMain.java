package com.pkg.inheritance;

public class GameMain {

	/**
	 * @param args
	 */

	public void doStuff(Game game){

		game.showGame();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GameMain gameMain = new GameMain();
		GameCricket  gameCricket = new GameCricket();
		gameMain.doStuff(gameCricket);
		GameFootBall gameFootBall = new GameFootBall();
		gameMain.doStuff(gameFootBall);
	}

}
