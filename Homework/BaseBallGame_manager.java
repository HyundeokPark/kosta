package Homework;

import java.util.Collections;
import java.util.Random;

public class BaseBallGame_manager {
	BaseBallPlayer p;
	BaseBallScore score;
	int strike, ball,count = 0;
	
	public BaseBallGame_manager() {
		Random r = new Random();
		
		int[] scores = new int[3];
		for(int i=0; i<3; i++) {
			scores[i] = r.nextInt(9)+1;
			for(int j=0; j<i; j++) {
				if(scores[i]==scores[j] && i>0) {
					i--;
				}
			}
		}
		this.score = new BaseBallScore(scores);
	}
	
	public void countStrike() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(p.getPlayerScore()[i] == score.getManagerScore()[j]) {
					if(i==j){
						strike++;
						//System.out.println("게임점수 :"+ score.getManagerScore()[j]+"선수 :"+p.getPlayerScore()[i]+"strike : "  +strike);
					}
					else {
						ball++;
						//System.out.println("게임점수 :"+ score.getManagerScore()[j]+"선수 :"+p.getPlayerScore()[i]+"ball : "  +ball);
					}
				}
			}
		}
		System.out.println(strike+"S"+ball+"B");
		if(strike >= 3) {
			System.out.println((count+1)+"번 만에 맞추셨습니다.");
			System.exit(0);
		}
		strike =0 ;
		ball = 0;
		count++;
	}
	
	
	public BaseBallPlayer getP() {
		return p;
	}


	public BaseBallScore getScore() {
		return score;
	}

	public void setPlayerScore(int[] player) {
		p = new BaseBallPlayer(player);
	}
	
	public boolean search(int num1,int num2) {
			if(num1 == num2) {
				return true;
			}
		return false;
	}
}
