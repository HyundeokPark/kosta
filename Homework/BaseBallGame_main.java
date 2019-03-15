package Homework;

import java.util.Random;

public class BaseBallGame_main {
	
	public static void play(int[] playerScore, BaseBallGame_manager gm) {
		int num =0;
		System.out.printf("점수를 입력 :");
		num = BaseBallGame_DataInput.sc.nextInt();
		for(int i=0; i<3; i++) { 
			switch(i) {
			case 0:
				playerScore[i] = num/100;
				num = num%100;
				break;
			case 1:
				playerScore[i] = num/10;
				num = num%10;
				break;
			case 2:
				playerScore[i] = num/1;
				num = num%1;
				break;
				}
			
		}
		gm.setPlayerScore(playerScore);
		
		for(int i=0; i<3; i++) {
			System.out.print(gm.getScore().getManagerScore()[i]);
			//System.out.println("게임 점수 : " + gm.getScore().getManagerScore());
		}
		System.out.println();
		
//		for(int i=0; i<3; i++) {
//			System.out.print(gm.getP().getPlayerScore()[i]);
//		}
//		System.out.println();
//		//System.out.println("플레이어점수 : "+gm.getP().getPlayerScore());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playerScore[] = new int[3];
		int count =0;
		BaseBallGame_manager gm = new  BaseBallGame_manager();

		while(true) {
			play(playerScore , gm);
			gm.setPlayerScore(playerScore);
			gm.countStrike();
			}
	}
}

