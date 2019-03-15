package Homework;

public class BaseBallPlayer {
	private int[] playerScore;
	public BaseBallPlayer() {
		
	}
	
	public BaseBallPlayer(int[] score) {
		playerScore = new int[3];
		for(int i=0; i<3; i++) {
			this.playerScore[i] = score[i];
		}
	}
	
	public int[] getPlayerScore() {
		return this.playerScore;
	}
}
