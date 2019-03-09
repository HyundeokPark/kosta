package kosta_oop;

public class Grade {
	private String owner;
	private int kor;
	private int math;
	private int eng;
	private String[] subjects;
	private int[] scores;
	//int[] scores = {kor,math,eng};
	public Grade() {

	}
	
	public Grade(String ownwer , int kor, int eng, int math) {
		this.owner = owner;
		this.scores[0] = kor;
		this.scores[1] = eng;
		this.scores[2] = math;
	}
	
	
	public int getTotal() {
		int total = 0;
		total = this.scores[0] + this.scores[1] + this.scores[2];
		return total;
	}
	
	public int getAver() {
		int aver =0;
		aver = this.getTotal() / 3;
		return aver;
	}
	
	public void sorted_score() {
		int tmp=0;
		//int[] scores = {kor,math,eng};
		for(int i=0; i<3; i++) {
			for(int j=i+1; j<3; j++) {
				if(scores[i] > scores[j]) {
					tmp = scores[i];
					scores[i] = scores[j];
					scores[j] = tmp;
				}
			}
		}
		for(int i=0; i<3; i++) {
			System.out.print(scores[i] + " ");
		}	
	}
	
	// getter
	public String getOwner() {
		return this.owner;
	}
	
	public int getEng() {
		return this.scores[1];
	}
	
	public int getKor() {
		return this.scores[0];
	}
	
	public int getMath() {
		return this.scores[2];
	}
	
	
	
	//setter
	public void setOwner(String newOwner) {
		this.owner = newOwner;
	}
	public void setEng(int newEng) {
		this.scores[1] = newEng;
	}
	public void setKor(int newKor) {
		this.scores[0] = newKor;
	}
	public void setMath(int newMath) {
		this.scores[2] = newMath;
	}
	
}
