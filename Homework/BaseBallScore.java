package Homework;

public class BaseBallScore {
	int[] managerScore = new int[3] ;
	
	public BaseBallScore() {
		//this.managerScore = new int[3];
	}
	
	public BaseBallScore(int[] score) {
		for(int i=0; i<3; i++) {
			this.managerScore[i] = score[i];
		}
	}
	
	public int[] getManagerScore() {
		return this.managerScore;
	}
}
